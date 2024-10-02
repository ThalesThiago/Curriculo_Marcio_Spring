package com.example.demo;

import com.exemplo.curriculo.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
}