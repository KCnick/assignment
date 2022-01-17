/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nick.assignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nick
 */
public class EmployeeService {
    
   public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
       employees.add(Employee1.addEmployee());
       employees.add(Employee2.addEmployee());
       employees.add(Employee3.addEmployee());
       return employees;
    }
    
}
