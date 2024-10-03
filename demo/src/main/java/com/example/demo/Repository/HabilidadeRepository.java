package com.example.demo.Repository;

import com.example.demo.Model.Habilidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabilidadeRepository extends JpaRepository<Habilidade, Long> {
}