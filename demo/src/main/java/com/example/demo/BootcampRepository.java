package com.example.demo;

import com.exemplo.curriculo.model.Bootcamp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BootcampRepository extends JpaRepository<Bootcamp, Long> {
}