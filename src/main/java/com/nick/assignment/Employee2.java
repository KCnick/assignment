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
public class Employee2 {
    public static Employee addEmployee() {
       Employee employee = new Employee();
        employee.setFullname("Maria");
        employee.setUsername("maria");
        employee.setPassword("maria2022");
        employee.setRole("data adminstrator");
        List<Access> accessRights = createEmployeeAccessRight();
        employee.setAccessrights(accessRights);
        return employee;
    }

    private static List<Access> createEmployeeAccessRight() {
    List<Access> accessRights = new ArrayList<>();
    accessRights.add(createAccessRight());
    accessRights.add(createAccessRight1());
    accessRights.add(createAccessRight2());
    accessRights.add(createAccessRight3());
    accessRights.add(createAccessRight4());
    return accessRights;
    }
    
    private static Access createAccessRight() {
        List<Resource> resources = addResources();
        Access access = new Access();
        access.setRead(Boolean.TRUE);
        access.setWrite(Boolean.FALSE);
        access.setUpdate(Boolean.TRUE);      
        
        access.setResources(resources);
        return access;
    }

    private static Access createAccessRight1() {
        List<Resource> resources = addResources1();
        Access access = new Access();
        access.setRead(Boolean.FALSE);
        access.setWrite(Boolean.FALSE);
        access.setUpdate(Boolean.FALSE);      
        
        access.setResources(resources);
        return access;
    }
    
     private static List<Resource> addResources1() {
       List<Resource> resources = new ArrayList<>();
       resources.add(addResource2());
       resources.add( addResource3());
       return resources;
    }
     private static Resource addResource2() {
        Resource resource = new Resource();
        resource.setName("Sharepoint");
        return resource;
    }
    
     private static Resource addResource3() {
        Resource resource = new Resource();
        resource.setName(" Admin folders");
        return resource;
    }
    private static List<Resource> addResources() {
       List<Resource> resources = new ArrayList<>();
       resources.add(addResource());
       resources.add( addResource1());
       return resources;
    }

    private static Resource addResource() {
        Resource resource = new Resource();
        resource.setName("EmailServer");
        return resource;
    }
    
     private static Resource addResource1() {
        Resource resource = new Resource();
        resource.setName("Admin Panel");
        return resource;
    }
     
    private static Access createAccessRight2() {
        List<Resource> resources = addResources2();
        Access access = new Access();
        access.setRead(Boolean.TRUE);
        access.setWrite(Boolean.TRUE);
        access.setUpdate(Boolean.TRUE);      
        
        access.setResources(resources);
        return access;
    }
    
     private static List<Resource> addResources2() {
       List<Resource> resources = new ArrayList<>();
       resources.add(addResource4());
       resources.add( addResource5());
       return resources;
    }
     private static Resource addResource4() {
        Resource resource = new Resource();
        resource.setName("Sharepoint");
        return resource;
    }
    
     private static Resource addResource5() {
        Resource resource = new Resource();
        resource.setName("Regular folders");
        return resource;
    }
     
    private static Access createAccessRight3() {
        List<Resource> resources = addResources3();
        Access access = new Access();
        access.setRead(Boolean.TRUE);
        access.setWrite(Boolean.TRUE);
        access.setUpdate(Boolean.TRUE);      
        
        access.setResources(resources);
        return access;
    }
    
     private static List<Resource> addResources3() {
       List<Resource> resources = new ArrayList<>();
       resources.add(addResource6());
       return resources;
    }
     private static Resource addResource6() {
        Resource resource = new Resource();
        resource.setName("Website");
        return resource;
    }
    
     
      private static Access createAccessRight4() {
        List<Resource> resources = addResources4();
        Access access = new Access();
        access.setRead(Boolean.TRUE);
        access.setWrite(Boolean.TRUE);
        access.setUpdate(Boolean.TRUE);      
        
        access.setResources(resources);
        return access;
    }
    
     private static List<Resource> addResources4() {
       List<Resource> resources = new ArrayList<>();
       resources.add(addResource7());
       resources.add(addResource8());
       return resources;
    }
     private static Resource addResource7() {
        Resource resource = new Resource();
        resource.setName("Database Server");
        return resource;
    }
    private static Resource addResource8() {
        Resource resource = new Resource();
        resource.setName("Admin Panel");
        return resource;
    }
    
}
