package com.example.demo.Repository;

import com.example.demo.Model.Bootcamp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BootcampRepository extends JpaRepository<Bootcamp, Long> {
}