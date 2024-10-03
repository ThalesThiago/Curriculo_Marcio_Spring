package com.example.demo;

import com.example.demo.Repository.*;
import com.example.demo.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Enviar implements CommandLineRunner {

    @Autowired
    com.example.curriculo.Service.BootcampService bootcampService;
    EducacaoService educacaoService;
    ExperienciaService experienciaService;
    HabilidadeService habilidadeService;
    ProjetosService projetosService;
    UsuarioService usuarioService;
    BootcampRepository bootcampRepository;
    EducacaoRepository educacaoRepository;
    ExperienciaRepository experienciaRepository;
    HabilidadeRepository habilidadeRepository;
    UsuarioRepository pessoalRepository;
    UsuarioRepository usuarioRepository;


    @Override
    public void run(String... args)  throws Exception {



    }
}
