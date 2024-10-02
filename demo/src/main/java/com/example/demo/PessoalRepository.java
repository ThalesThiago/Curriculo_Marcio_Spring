package com.example.demo;

import com.exemplo.curriculo.model.Pessoal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoalRepository extends JpaRepository<Pessoal, Long> {
}