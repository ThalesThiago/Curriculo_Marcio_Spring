package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "educacao")
public class Educacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nivel;
    private String curso;
    private String instituicao;
    private String anoConclusao;

    // Getters e Setters
}