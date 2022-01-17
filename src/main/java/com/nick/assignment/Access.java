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
public class Access {
    private Boolean read;
    private Boolean write;
    private Boolean update;
    private List<Resource> resources;

    public Access() {
    }

    public Access(Boolean read, Boolean write, Boolean update, List<Resource> resources) {
        this.read = read;
        this.write = write;
        this.update = update;
        this.resources = resources;
    }

    public Boolean getRead() {
        return read;
    }

    public void setRead(Boolean read) {
        this.read = read;
    }

    public Boolean getWrite() {
        return write;
    }

    public void setWrite(Boolean write) {
        this.write = write;
    }

    public Boolean getUpdate() {
        return update;
    }

    public void setUpdate(Boolean update) {
        this.update = update;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }
    
    
    
    
}
