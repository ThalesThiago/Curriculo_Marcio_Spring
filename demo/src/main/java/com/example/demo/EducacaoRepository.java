package com.example.demo;

import com.exemplo.curriculo.model.Educacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacaoRepository extends JpaRepository<Educacao, Long> {
}