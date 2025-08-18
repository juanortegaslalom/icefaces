package org.icefaces.samples.showcase.alberta.model;

import java.io.Serializable;

/**
 * Contact information for staff members
 */
public class Contact implements Serializable {
    
    private String name;
    private String title;
    private String phone;
    private String email;
    
    public Contact() {
    }
    
    public Contact(String name, String title, String phone, String email) {
        this.name = name;
        this.title = title;
        this.phone = phone;
        this.email = email;
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
    
    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}