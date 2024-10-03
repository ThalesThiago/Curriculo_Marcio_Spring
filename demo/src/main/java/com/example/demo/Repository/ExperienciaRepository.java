package com.example.demo.Repository;

import com.example.demo.Model.Experiencia;
import com.exemplo.curriculo.model.Experiencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienciaRepository extends JpaRepository<Experiencia, Long> {
}