package com.Services.Services.models;

import java.io.Serializable;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "TB_Service")
public class ServicesModel implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, length = 20)
    private String name;
    @Column(nullable = false, length = 20)
    private String contact;
    @Column(nullable = false, length = 70)
    private String service;
    @Column(nullable = false, length = 70)
    private String value;
    @Column(nullable = false, length = 7)
    private String date;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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


