/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nick.assignment;

import java.util.List;
import com.fasterxml.jackson.*;
/**
 *
 * @author nick
 */
public class StartEmployee {
    public static void main(String args[]){
        List<Employee> employees = EmployeeService.getEmployees();        
	ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(employees);
	System.out.println(json);
    }
}
