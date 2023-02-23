package com.Services.Services.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CCustodto {

    @NotBlank
    private String cc;
    @NotNull
    private Integer mod;
    @NotNull
    private Integer md;
    @NotNull
    private Integer cif;
    @NotNull
    private Integer cpp;

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
