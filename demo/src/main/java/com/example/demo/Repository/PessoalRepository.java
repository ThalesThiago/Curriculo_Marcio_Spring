package com.example.demo.Repository;

import com.example.demo.Model.Pessoal;
import com.exemplo.curriculo.model.Pessoal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoalRepository extends JpaRepository<Pessoal, Long> {
}