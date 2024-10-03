package com.example.demo.Controller;

import com.example.demo.Model.*;
import com.example.demo.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/curriculo")
public class CurriculoController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
 BootcampService bootcampService;
    @Autowired
    private ExperienciaService experienciaService;

    @Autowired
    private HabilidadeService habilidadeService;

    @Autowired
    private EducacaoService educacaoService;

    @Autowired
    private ProjetosService projetoService;

    // ================== Endpoints para Usuario ==================

    @GetMapping("/pessoal")
    public List<Usuario> getUsuarios() {
        return usuarioService.getAllUsuarios();
    }

    @GetMapping("/pessoal/{id}")
    public Optional<Usuario> getUsuarioById(@PathVariable Long id) {
        return usuarioService.getUsuarioById(id);
    }

    @PostMapping("/pessoal")
    public Usuario createUsuario(@RequestBody Usuario usuario) {
        return usuarioService.criarUsuario(usuario);
    }

    @PutMapping("/pessoal/{id}")
    public Usuario updateUsuario(@PathVariable Long id, @RequestBody Usuario usuarioDetalhes) throws Exception {
        return usuarioService.atualizarUsuario(id, usuarioDetalhes);
    }

    @DeleteMapping("/pessoal/{id}")
    public void deleteUsuario(@PathVariable Long id) {
        usuarioService.deletarUsuario(id);
    }

    // ================== Endpoints para Bootcamp ==================

    @GetMapping("/bootcamps")
    public List<Bootcamp> getBootcamps() {
        return bootcampService.getAllBootcamp();
    }

    @GetMapping("/bootcamps/{id}")
    public Optional<Bootcamp> getBootcampById(@PathVariable Long id) {
        return bootcampService.getBootcampById(id);
    }

    @PostMapping("/bootcamps")
    public Bootcamp createBootcamp(@RequestBody Bootcamp bootcamp) {
        return bootcampService.criarBootcamp(bootcamp);
    }

    @PutMapping("/bootcamps/{id}")
    public Bootcamp updateBootcamp(@PathVariable Long id, @RequestBody Bootcamp bootcampDetalhes) throws Exception {
        return bootcampService.atualizarBootcamp(id, bootcampDetalhes);
    }

    @DeleteMapping("/bootcamps/{id}")
    public void deleteBootcamp(@PathVariable Long id) {
        bootcampService.deletarBootcamp(id);
    }

    // ================== Endpoints para Experiencia ==================

    @GetMapping("/experiencias")
    public List<Experiencia> getExperiencias() {
        return experienciaService.getAllExperiencia();
    }

    @GetMapping("/experiencias/{id}")
    public Optional<Experiencia> getExperienciaById(@PathVariable Long id) {
        return experienciaService.getExperienciaById(id);
    }

    @PostMapping("/experiencias")
    public Experiencia createExperiencia(@RequestBody Experiencia experiencia) {
        return experienciaService.criarExperiencia(experiencia);
    }

    @PutMapping("/experiencias/{id}")
    public Experiencia updateExperiencia(@PathVariable Long id, @RequestBody Experiencia experienciaDetalhes) throws Exception {
        return experienciaService.atualizarExperiencia(id, experienciaDetalhes);
    }

    @DeleteMapping("/experiencias/{id}")
    public void deleteExperiencia(@PathVariable Long id) {
        experienciaService.deletarExperiencia(id);
    }

    // ================== Endpoints para Habilidade ==================

    @GetMapping("/habilidades")
    public List<Habilidade> getHabilidades() {
        return habilidadeService.getAllHabilidade();
    }

    @GetMapping("/habilidades/{id}")
    public Optional<Habilidade> getHabilidadeById(@PathVariable Long id) {
        return habilidadeService.getHabilidadeById(id);
    }

    @PostMapping("/habilidades")
    public Habilidade createHabilidade(@RequestBody Habilidade habilidade) {
        return habilidadeService.criarHabilidade(habilidade);
    }

    @PutMapping("/habilidades/{id}")
    public Habilidade updateHabilidade(@PathVariable Long id, @RequestBody Habilidade habilidadeDetalhes) throws Exception {
        return habilidadeService.atualizarHabilidade(id, habilidadeDetalhes);
    }

    @DeleteMapping("/habilidades/{id}")
    public void deleteHabilidade(@PathVariable Long id) {
        habilidadeService.deletarHabilidade(id);
    }

    // ================== Endpoints para Educacao ==================

    @GetMapping("/educacoes")
    public List<Educacao> getEducacoes() {
        return educacaoService.getAllEducacao();
    }

    @GetMapping("/educacoes/{id}")
    public Optional<Educacao> getEducacaoById(@PathVariable Long id) {
        return educacaoService.getEducacaoById(id);
    }

    @PostMapping("/educacoes")
    public Educacao createEducacao(@RequestBody Educacao educacao) {
        return educacaoService.criarEducacao(educacao);
    }

    @PutMapping("/educacoes/{id}")
    public Educacao updateEducacao(@PathVariable Long id, @RequestBody Educacao educacaoDetalhes) throws Exception {
        return educacaoService.atualizarEducacao(id, educacaoDetalhes);
    }

    @DeleteMapping("/educacoes/{id}")
    public void deleteEducacao(@PathVariable Long id) {
        educacaoService.deletarEducacao(id);
    }

    // ================== Endpoints para Projeto ==================

    @GetMapping("/projetos")
    public List<Projetos> getProjetos() {
        return projetoService.getAllProjeto();
    }

    @GetMapping("/projetos/{id}")
    public Optional<Projetos> getProjetoById(@PathVariable Long id) {
        return projetoService.getProjetoById(id);
    }

    @PostMapping("/projetos")
    public Projetos createProjeto(@RequestBody Projetos projeto) {
        return projetoService.criarProjeto(projeto);
    }

    @PutMapping("/projetos/{id}")
    public Projetos updateProjeto(@PathVariable Long id, @RequestBody Projetos projetoDetalhes) throws Exception {
        return projetoService.atualizarProjeto(id, projetoDetalhes);
    }

    @DeleteMapping("/projetos/{id}")
    public void deleteProjeto(@PathVariable Long id) {
        projetoService.deletarProjeto(id);
    }
}
