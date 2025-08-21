package org.icefaces.samples.showcase.alberta.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Simple JDBC database connection manager
 * - No connection pooling for simplicity
 * - Easy to understand and migrate
 */
public class DatabaseManager {
    
    private static final String DB_URL = "jdbc:mysql://mysql-db:3306/employeedb";
    private static final String DB_USER = "iceuser";
    private static final String DB_PASSWORD = "icepass";
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    
    private static DatabaseManager instance;
    
    private DatabaseManager() {
        // Load MySQL driver
        try {
            Class.forName(DB_DRIVER);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("MySQL JDBC Driver not found", e);
        }
    }
    
    public static synchronized DatabaseManager getInstance() {
        if (instance == null) {
            instance = new DatabaseManager();
        }
        return instance;
    }
    
    /**
     * Get a simple JDBC connection
     */
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
    }
}