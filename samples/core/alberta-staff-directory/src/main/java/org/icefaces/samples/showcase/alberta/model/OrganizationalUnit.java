package org.icefaces.samples.showcase.alberta.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents an organizational unit (Ministry, Division, Branch, Office, etc.)
 */
public class OrganizationalUnit implements Serializable {
    
    private String name;
    private String type; // ministry, division, branch, office, department
    private List<Contact> contacts;
    private List<OrganizationalUnit> children;
    private OrganizationalUnit parent;
    private boolean expanded = false;
    
    public OrganizationalUnit() {
        this.contacts = new ArrayList<Contact>();
        this.children = new ArrayList<OrganizationalUnit>();
    }
    
    public OrganizationalUnit(String name, String type) {
        this();
        this.name = name;
        this.type = type;
    }
    
    // Helper methods
    public void addChild(OrganizationalUnit child) {
        child.setParent(this);
        this.children.add(child);
    }
    
    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
    
    public boolean hasChildren() {
        return children != null && !children.isEmpty();
    }
    
    // JSF EL property accessor
    public boolean getHasChildren() {
        return hasChildren();
    }
    
    public boolean hasContacts() {
        return contacts != null && !contacts.isEmpty();
    }
    
    // JSF EL property accessor  
    public boolean getHasContacts() {
        return hasContacts();
    }
    
    public int getTotalContacts() {
        int total = contacts != null ? contacts.size() : 0;
        if (children != null) {
            for (OrganizationalUnit child : children) {
                total += child.getTotalContacts();
            }
        }
        return total;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    public List<Contact> getContacts() {
        return contacts;
    }
    
    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
    
    public List<OrganizationalUnit> getChildren() {
        return children;
    }
    
    public void setChildren(List<OrganizationalUnit> children) {
        this.children = children;
    }
    
    public OrganizationalUnit getParent() {
        return parent;
    }
    
    public void setParent(OrganizationalUnit parent) {
        this.parent = parent;
    }
    
    public boolean isExpanded() {
        return expanded;
    }
    
    public void setExpanded(boolean expanded) {
        this.expanded = expanded;
    }
    
    @Override
    public String toString() {
        return "OrganizationalUnit{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", childrenCount=" + (children != null ? children.size() : 0) +
                ", contactsCount=" + (contacts != null ? contacts.size() : 0) +
                '}';
    }
}