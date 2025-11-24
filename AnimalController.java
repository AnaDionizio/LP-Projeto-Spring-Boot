package com.example.bemestaranimal.controller;

import com.example.bemestaranimal.entity.Animal;
import com.example.bemestaranimal.service.AnimalService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public List<Animal> listar() {
        return service.listar();
    }

    @PostMapping
    public Animal salvar(@RequestBody Animal animal) {
        return service.salvar(animal);
    }
}
