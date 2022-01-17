/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nick.assignment;

import java.util.List;

/**
 *
 * @author nick
 */
public class Employee {
     private String fullname;
    private String username;
    private String password;
    private String role;
    private List<Access> accessrights;

    public Employee() {
    }

    public Employee(String fullname, String username, String password, String role, List<Access> accessrights) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
        this.role = role;
        this.accessrights = accessrights;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Access> getAccessrights() {
        return accessrights;
    }

    public void setAccessrights(List<Access> accessrights) {
        this.accessrights = accessrights;
    }
    
    
}
