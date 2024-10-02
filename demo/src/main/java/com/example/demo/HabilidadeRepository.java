package com.example.demo;

import com.exemplo.curriculo.model.Habilidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabilidadeRepository extends JpaRepository<Habilidade, Long> {
}