package com.example.demo.Repository;

import com.example.demo.Model.Projeto;
import com.exemplo.curriculo.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}