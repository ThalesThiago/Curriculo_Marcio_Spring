package com.example.demo;

import com.example.demo.Model.*;
import com.example.demo.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Enviar implements CommandLineRunner {

    @Autowired
    private BootcampService bootcampService;

    @Autowired
    private EducacaoService educacaoService;

    @Autowired
    private ExperienciaService experienciaService;

    @Autowired
    private HabilidadeService habilidadeService;

    @Autowired
    private ProjetosService projetosService;

    @Autowired
    private UsuarioService usuarioService;

    @Override
    public void run(String... args) throws Exception {

        Usuario usuario = new Usuario();
        usuario.setNome("Thales Thiado");
        usuario.setEndereco("Rua Exemplo, 123");
        usuario.setTelefone("(81) 99999-9999");
        usuario.setLinkedin("https://linkedin.com/in/thales");
        usuario.setInstagram("https://instagram.com/thales");
        usuario.setGithub("https://github.com/thales");
        usuarioService.criarUsuario(usuario);


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Spring Boot Camp");
        bootcamp.setInstituicao("Udemy");
        bootcamp.setAno("2023");
        bootcampService.criarBootcamp(bootcamp);


        Educacao educacao = new Educacao();
        educacao.setNivel("Graduação");
        educacao.setCurso("Ciência da Computação");
        educacao.setInstituicao("Universidade Federal de Pernambuco");
        educacao.setAnoConclusao("2022");
        educacaoService.criarEducacao(educacao);


        Experiencia experiencia = new Experiencia();
        experiencia.setCargo("Desenvolvedor Java");
        experiencia.setEmpresa("Empresa Exemplo");
        experiencia.setPeriodo("2020-2022");
        experiencia.setResponsabilidades("Desenvolvimento de APIs com Spring Boot.");
        experienciaService.criarExperiencia(experiencia);


        Habilidade habilidade = new Habilidade();
        habilidade.setDescricao("Desenvolvimento em Java e Spring Boot");
        habilidadeService.criarHabilidade(habilidade);


        Projetos projeto = new Projetos();
        projeto.setNome("Sistema de Currículos");
        projeto.setDescricao("Sistema de gerenciamento de currículos usando Spring Boot.");
        projeto.setTecnologias("Java, Spring Boot, React");
        projeto.setAno("2024");
        projetosService.criarProjeto(projeto);

        System.out.println("Dados de exemplo inseridos com sucesso!");
    }
}
