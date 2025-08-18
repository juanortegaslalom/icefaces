#!/usr/bin/env python3
"""
Alberta Staff Directory Data Migration Script
Migrates JSON data to MySQL database
"""

import json
import mysql.connector
import sys
from typing import Dict, List, Any

# Database configuration
DB_CONFIG = {
    'host': 'localhost',
    'port': 3306,
    'user': 'iceuser',
    'password': 'icepass',
    'database': 'employeedb',
    'charset': 'utf8mb4'
}

def connect_to_database():
    """Connect to MySQL database"""
    try:
        conn = mysql.connector.connect(**DB_CONFIG)
        print("✅ Connected to MySQL database successfully")
        return conn
    except mysql.connector.Error as e:
        print(f"❌ Error connecting to database: {e}")
        sys.exit(1)

def create_schema(conn):
    """Create database schema"""
    cursor = conn.cursor()
    
    # Read and execute schema SQL
    with open('/Users/juanortega/cursor/icefaces/scripts/init-alberta-db.sql', 'r') as f:
        schema_sql = f.read()
    
    # Split and execute each statement
    statements = [stmt.strip() for stmt in schema_sql.split(';') if stmt.strip()]
    
    for statement in statements:
        try:
            cursor.execute(statement)
            print(f"✅ Executed: {statement[:50]}...")
        except mysql.connector.Error as e:
            print(f"❌ Error executing statement: {e}")
            print(f"Statement: {statement}")
    
    conn.commit()
    cursor.close()
    print("✅ Database schema created successfully")

def load_json_data():
    """Load Alberta directory JSON data"""
    try:
        with open('/Users/juanortega/cursor/icefaces/alberta_directory.json', 'r') as f:
            data = json.load(f)
        print(f"✅ Loaded JSON data: {len(data)} ministries")
        return data
    except FileNotFoundError:
        print("❌ Alberta directory JSON file not found")
        sys.exit(1)
    except json.JSONDecodeError as e:
        print(f"❌ Error parsing JSON: {e}")
        sys.exit(1)

def insert_ministry(cursor, ministry_name: str) -> int:
    """Insert ministry and return ID"""
    insert_sql = "INSERT INTO ministries (name) VALUES (%s)"
    cursor.execute(insert_sql, (ministry_name,))
    ministry_id = cursor.lastrowid
    print(f"  📁 Added ministry: {ministry_name} (ID: {ministry_id})")
    return ministry_id

def determine_unit_type(unit_data: Dict[str, Any]) -> str:
    """Determine organizational unit type from data"""
    if 'department' in unit_data:
        return 'department'
    elif 'office' in unit_data:
        return 'office'
    elif 'division' in unit_data:
        return 'division'
    elif 'branch' in unit_data:
        return 'branch'
    else:
        return 'section'

def get_unit_name(unit_data: Dict[str, Any]) -> str:
    """Extract unit name from data"""
    for key in ['department', 'office', 'division', 'branch', 'section']:
        if key in unit_data:
            return unit_data[key]
    return "Unknown Unit"

def insert_organizational_unit(cursor, ministry_id: int, unit_data: Dict[str, Any], 
                             parent_id: int = None, level: int = 0) -> int:
    """Insert organizational unit and return ID"""
    unit_name = get_unit_name(unit_data)
    unit_type = determine_unit_type(unit_data)
    
    insert_sql = """
        INSERT INTO organizational_units (ministry_id, parent_id, name, unit_type, level) 
        VALUES (%s, %s, %s, %s, %s)
    """
    cursor.execute(insert_sql, (ministry_id, parent_id, unit_name, unit_type, level))
    unit_id = cursor.lastrowid
    
    indent = "  " * (level + 1)
    print(f"{indent}📂 Added {unit_type}: {unit_name} (ID: {unit_id})")
    return unit_id

def insert_contact(cursor, ministry_id: int, unit_id: int, contact_data: Dict[str, Any]):
    """Insert contact"""
    insert_sql = """
        INSERT INTO contacts (ministry_id, organizational_unit_id, name, title, phone, email) 
        VALUES (%s, %s, %s, %s, %s, %s)
    """
    
    name = contact_data.get('name', '').strip()
    title = contact_data.get('title', '').strip()
    phone = contact_data.get('phone', '').strip()
    email = contact_data.get('email', '').strip()
    
    # Skip empty contacts
    if not name and not phone:
        return
    
    cursor.execute(insert_sql, (ministry_id, unit_id, name, title, phone, email))
    contact_id = cursor.lastrowid
    print(f"    👤 Added contact: {name} - {title} ({phone})")

def process_organizational_unit(cursor, ministry_id: int, unit_data: Dict[str, Any], 
                              parent_id: int = None, level: int = 0):
    """Recursively process organizational unit and its children"""
    # Insert the unit
    unit_id = insert_organizational_unit(cursor, ministry_id, unit_data, parent_id, level)
    
    # Insert contacts for this unit
    for contact in unit_data.get('contacts', []):
        insert_contact(cursor, ministry_id, unit_id, contact)
    
    # Process children recursively
    for child in unit_data.get('children', []):
        process_organizational_unit(cursor, ministry_id, child, unit_id, level + 1)

def migrate_data(conn, json_data: List[Dict[str, Any]]):
    """Migrate JSON data to database"""
    cursor = conn.cursor()
    
    total_ministries = 0
    total_units = 0
    total_contacts = 0
    
    for ministry_data in json_data:
        ministry_name = ministry_data.get('ministry', '')
        if not ministry_name:
            continue
            
        # Insert ministry
        ministry_id = insert_ministry(cursor, ministry_name)
        total_ministries += 1
        
        # Insert ministry-level contacts
        for contact in ministry_data.get('contacts', []):
            insert_contact(cursor, ministry_id, None, contact)
            total_contacts += 1
        
        # Process organizational units
        for unit_data in ministry_data.get('children', []):
            process_organizational_unit(cursor, ministry_id, unit_data, None, 0)
    
    conn.commit()
    cursor.close()
    
    # Get final counts
    cursor = conn.cursor()
    cursor.execute("SELECT COUNT(*) FROM ministries")
    total_ministries = cursor.fetchone()[0]
    
    cursor.execute("SELECT COUNT(*) FROM organizational_units")
    total_units = cursor.fetchone()[0]
    
    cursor.execute("SELECT COUNT(*) FROM contacts")
    total_contacts = cursor.fetchone()[0]
    
    cursor.close()
    
    print(f"\n🎉 Migration completed successfully!")
    print(f"📊 Final counts:")
    print(f"   📁 Ministries: {total_ministries}")
    print(f"   📂 Organizational Units: {total_units}")
    print(f"   👤 Contacts: {total_contacts}")

def main():
    """Main migration function"""
    print("🚀 Starting Alberta Staff Directory data migration...")
    
    # Connect to database
    conn = connect_to_database()
    
    try:
        # Create schema
        create_schema(conn)
        
        # Load JSON data
        json_data = load_json_data()
        
        # Migrate data
        migrate_data(conn, json_data)
        
    except Exception as e:
        print(f"❌ Migration failed: {e}")
        conn.rollback()
        sys.exit(1)
    
    finally:
        conn.close()
        print("✅ Database connection closed")

if __name__ == "__main__":
    main()