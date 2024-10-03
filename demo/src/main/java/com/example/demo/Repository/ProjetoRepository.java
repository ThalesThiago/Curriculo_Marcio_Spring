package com.example.demo.Repository;

import com.example.demo.Model.Projetos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjetoRepository extends JpaRepository<Projetos, Long> {
}