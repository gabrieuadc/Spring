package com.Services.Services.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_Ccustos")
public class CCustoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 70)
    private String cc;
    @Column(nullable = false, length = 70)
    private Integer mod;
    @Column(nullable = false, length = 70)
    private Integer md;
    @Column(nullable = false, length = 70)
    private Integer cif;
    @Column(nullable = false, length = 70)
    private Integer cpp;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public Integer getMod() {
        return mod;
    }

    public void setMod(Integer mod) {
        this.mod = mod;
    }

    public Integer getMd() {
        return md;
    }

    public void setMd(Integer md) {
        this.md = md;
    }

    public Integer getCif() {
        return cif;
    }

    public void setCif(Integer cif) {
        this.cif = cif;
    }

    public Integer getCpp() {
        return cpp;
    }

    public void setCpp(Integer cpp) {
        this.cpp = cpp;
    }
}
