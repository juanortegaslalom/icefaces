package org.icefaces.samples.showcase.alberta.model;

import java.io.Serializable;

/**
 * Contact entity representing Alberta government staff
 */
public class Contact implements Serializable {
    
    private String name;
    private String title;
    private String phone;
    private String email;
    private String ministry;
    private String role_type; // minister, deputy_minister, staff
    
    public Contact() {
    }
    
    public Contact(String name, String title, String phone, String email, String ministry, String roleType) {
        this.name = name;
        this.title = title;
        this.phone = phone;
        this.email = email;
        this.ministry = ministry;
        this.role_type = roleType;
    }
    
    // Getters and setters
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getMinistry() {
        return ministry;
    }
    
    public void setMinistry(String ministry) {
        this.ministry = ministry;
    }
    
    public String getRole_type() {
        return role_type;
    }
    
    public void setRole_type(String role_type) {
        this.role_type = role_type;
    }
    
    
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", ministry='" + ministry + '\'' +
                ", role_type='" + role_type + '\'' +
                '}';
    }
}