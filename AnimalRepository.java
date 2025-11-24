package com.example.bemestaranimal.repository;

import com.example.bemestaranimal.entity.Animal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimalRepository extends JpaRepository<Animal, Long> {
}
