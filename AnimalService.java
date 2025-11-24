package com.example.bemestaranimal.service;

import com.example.bemestaranimal.entity.Animal;
import com.example.bemestaranimal.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public List<Animal> listar() {
        return repository.findAll();
    }

    public Animal salvar(Animal animal) {
        return repository.save(animal);
    }
}
