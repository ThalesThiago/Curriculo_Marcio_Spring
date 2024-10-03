package com.example.demo.Controller;


import com.example.demo.Model.Usuario;
import com.example.demo.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curriculo")
public class CurriculoController {
    @Autowired
    private UsuarioRepository pessoalRepository;

    @GetMapping("/pessoal")
    public List<Usuario> getPessoal() {
        return pessoalRepository.findAll();
    }

    @PostMapping("/pessoal")
    public Usuario createPessoal(@RequestBody Usuario pessoal) {
        return pessoalRepository.save(pessoal);
    }

    
}