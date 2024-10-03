package com.example.demo.Repository;

import com.example.demo.Model.Educacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducacaoRepository extends JpaRepository<Educacao, Long> {
}