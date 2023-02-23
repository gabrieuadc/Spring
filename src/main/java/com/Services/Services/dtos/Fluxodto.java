package com.Services.Services.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public class Fluxodto {

    @NotNull
    private Integer clientes;

    @NotNull
    private Integer fornecedores;

    @NotNull
    private Integer despesas;

    @NotNull
    private Integer caixaop;

    @NotNull
    private Integer cativo;

    @NotNull
    private Integer recdiv;

    @NotNull
    private Integer caixainv;

    @NotNull
    private Integer pgfinan;

    @NotNull
    private Integer intcapital;

    @NotNull
    private Integer caixafinan;

    @NotNull
    private Integer saldodisponibilidade;

    @NotBlank
    private String exercicio;

    public Integer getClientes() {
        return clientes;
    }

    public void setClientes(Integer clientes) {
        this.clientes = clientes;
    }

    public Integer getFornecedores() {
        return fornecedores;
    }

    public void setFornecedores(Integer fornecedores) {
        this.fornecedores = fornecedores;
    }

    public Integer getDespesas() {
        return despesas;
    }

    public void setDespesas(Integer despesas) {
        this.despesas = despesas;
    }

    public Integer getCaixaop() {
        return caixaop;
    }

    public void setCaixaop(Integer caixaop) {
        this.caixaop = caixaop;
    }

    public Integer getCativo() {
        return cativo;
    }

    public void setCativo(Integer cativo) {
        this.cativo = cativo;
    }

    public Integer getRecdiv() {
        return recdiv;
    }

    public void setRecdiv(Integer recdiv) {
        this.recdiv = recdiv;
    }

    public Integer getCaixainv() {
        return caixainv;
    }

    public void setCaixainv(Integer caixainv) {
        this.caixainv = caixainv;
    }

    public Integer getPgfinan() {
        return pgfinan;
    }

    public void setPgfinan(Integer pgfinan) {
        this.pgfinan = pgfinan;
    }

    public Integer getIntcapital() {
        return intcapital;
    }

    public void setIntcapital(Integer intcapital) {
        this.intcapital = intcapital;
    }

    public Integer getCaixafinan() {
        return caixafinan;
    }

    public void setCaixafinan(Integer caixafinan) {
        this.caixafinan = caixafinan;
    }

    public Integer getSaldodisponibilidade() {
        return saldodisponibilidade;
    }

    public void setSaldodisponibilidade(Integer saldodisponibilidade) {
        this.saldodisponibilidade = saldodisponibilidade;
    }

    public String getExercicio() {
        return exercicio;
    }

    public void setExercicio(String exercicio) {
        this.exercicio = exercicio;
    }
}
