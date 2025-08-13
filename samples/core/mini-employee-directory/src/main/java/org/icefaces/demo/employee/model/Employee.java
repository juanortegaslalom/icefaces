/*
 * Copyright 2004-2013 ICEsoft Technologies Canada Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the
 * License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS
 * IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */

package org.icefaces.demo.employee.model;

import java.io.Serializable;

/**
 * Employee entity for the Mini Employee Directory demo.
 * Contains basic employee information including id, name, position, department, and email.
 */
public class Employee implements Serializable {
    
    private int id;
    private String name;
    private String position;
    private String department;
    private String email;
    
    // Default constructor
    public Employee() {
    }
    
    // Constructor for creating new employees (without id)
    public Employee(String name, String position, String department, String email) {
        this.name = name;
        this.position = position;
        this.department = department;
        this.email = email;
    }
    
    // Constructor with all fields
    public Employee(int id, String name, String position, String department, String email) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.department = department;
        this.email = email;
    }
    
    // Getters and Setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPosition() {
        return position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}