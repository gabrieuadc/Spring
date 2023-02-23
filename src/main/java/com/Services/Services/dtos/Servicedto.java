package com.Services.Services.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


public class Servicedto {

    @NotBlank
    private String name;
    @NotBlank
    private String contact;
    @NotBlank
    private String service;
    @NotBlank
    private String value;
    @NotBlank
    private String date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
