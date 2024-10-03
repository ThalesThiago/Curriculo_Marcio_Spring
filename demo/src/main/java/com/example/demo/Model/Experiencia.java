package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "experiencia")
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cargo;
    private String empresa;
    private String periodo;
    private String responsabilidades;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter e Setter para cargo
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Getter e Setter para empresa
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    // Getter e Setter para periodo
    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    // Getter e Setter para responsabilidades
    public String getResponsabilidades() {
        return responsabilidades;
    }

    public void setResponsabilidades(String responsabilidades) {
        this.responsabilidades = responsabilidades;
    }
}