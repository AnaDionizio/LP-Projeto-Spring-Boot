package com.example.petcare.repository;

import com.example.petcare.model.animais.Animal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepositoryArray {

    private final List<Animal> animais = new ArrayList<>();

    // Salva um novo animal
    public void salvar(Animal animal) {
        animais.add(animal);
    }

    // Busca animal pelo ID
    public Animal buscarPorId(Long id) {
        return animais.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Retorna todos os animais
    public List<Animal> listarTodos() {
        return new ArrayList<>(animais); // Retorna cópia para segurança
    }

    // Deleta animal pelo ID
    public boolean deletar(Long id) {
        return animais.removeIf(a -> a.getId().equals(id));
    }

    // Atualiza situação do animal
    public boolean atualizarSituacao(Long id, String situacao) {
        Animal a = buscarPorId(id);
        if (a == null) return false;

        a.setSituacao(situacao);
        return true;
    }
}
