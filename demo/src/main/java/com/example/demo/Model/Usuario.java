package com.example.demo.Model;


import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String endereco;
    private String telefone;
    private String linkedin;
    private String instagram;
    private String github;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Experiencia> experiencias;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Bootcamp> bootcamps;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Habilidade> habilidades;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Educacao> educacoes;


    // Getters e Setters

    public Long getId() {
        return id;
    }

    // Getter e Setter para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter e Setter para endereco
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    // Getter e Setter para telefone
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Getter e Setter para linkedin
    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    // Getter e Setter para instagram
    public String getInstagram() {
        return instagram;
    }

    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }

    // Getter e Setter para github
    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }
}