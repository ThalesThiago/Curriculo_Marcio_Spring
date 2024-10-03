package com.example.demo.Controller;


import com.example.demo.Model.Pessoal;
import com.example.demo.Repository.PessoalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/curriculo")
public class CurriculoController {
    @Autowired
    private PessoalRepository pessoalRepository;

    @GetMapping("/pessoal")
    public List<Pessoal> getPessoal() {
        return pessoalRepository.findAll();
    }

    @PostMapping("/pessoal")
    public Pessoal createPessoal(@RequestBody Pessoal pessoal) {
        return pessoalRepository.save(pessoal);
    }

    
}