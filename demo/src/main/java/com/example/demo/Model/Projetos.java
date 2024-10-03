package com.example.demo.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "projeto")
public class Projetos {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String nome;
        private String descricao;
        private String tecnologias;
        private String ano;

        // Getters e Setters

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        // Getter e Setter para nome
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        // Getter e Setter para descricao
        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        // Getter e Setter para tecnologias
        public String getTecnologias() {
            return tecnologias;
        }

        public void setTecnologias(String tecnologias) {
            this.tecnologias = tecnologias;
        }

        // Getter e Setter para ano
        public String getAno() {
            return ano;
        }

        public void setAno(String ano) {
            this.ano = ano;
        }

}
