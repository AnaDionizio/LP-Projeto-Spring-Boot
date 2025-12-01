package com.example.petcare.service;

import com.example.petcare.model.animais.Animal;
import com.example.petcare.repository.AnimalRepositoryArray;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
    private AnimalRepositoryArray repo = new AnimalRepositoryArray();

    public void cadastrar(Animal a) { repo.salvar(a); }
    public Animal buscar(Long id) { return repo.buscarPorId(id); }
}

