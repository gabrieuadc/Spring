package com.Services.Services.models;


import jakarta.persistence.*;

import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "TB_FLUXOCAIXA")
public class FluxoModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(nullable = false, length = 70)
    private Integer clientes;

    @Column(nullable = false, length = 70)
    private Integer fornecedores;

    @Column(nullable = false, length = 70)
    private Integer despesas;

    @Column(nullable = false, length = 70)
    private Integer caixaop;

    @Column(nullable = false, length = 70)
    private Integer cativo;

    @Column(nullable = false, length = 70)
    private Integer recdiv;

    @Column(nullable = false, length = 70)
    private Integer caixainv;

    @Column(nullable = false, length = 70)
    private Integer pgfinan;

    @Column(nullable = false, length = 70)
    private Integer intcapital;

    @Column(nullable = false, length = 70)
    private Integer caixafinan;

    @Column(nullable = false, length = 70)
    private Integer saldodisponibilidade;

    @Column(nullable = false, length = 70)
    private String exercicio;


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

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



