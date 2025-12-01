package com.example.petcare.controller;

import com.example.petcare.model.animais.Animal;
import com.example.petcare.model.animais.Cachorro;
import com.example.petcare.model.animais.Gato;
import com.example.petcare.repository.AnimalRepositoryArray;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/animais")
public class AnimalController {

    @Autowired
    private AnimalRepositoryArray repository;

    @PostMapping("/cadastrar/cachorro")
    public Animal cadastrarCachorro(@RequestBody Map<String, Object> body) {
        Long id = Long.valueOf(body.get("id").toString());
        String nome = body.get("nome").toString();
        int idade = Integer.parseInt(body.get("idade").toString());
        String sexo = body.get("sexo").toString();

        Cachorro c = new Cachorro(id, nome, idade, sexo);
        repository.salvar(c);
        return c;
    }

    @PostMapping("/cadastrar/gato")
    public Animal cadastrarGato(@RequestBody Map<String, Object> body) {
        Long id = Long.valueOf(body.get("id").toString());
        String nome = body.get("nome").toString();
        int idade = Integer.parseInt(body.get("idade").toString());
        String sexo = body.get("sexo").toString();

        Gato g = new Gato(id, nome, idade, sexo);
        repository.salvar(g);
        return g;
    }

    @GetMapping
    public List<Animal> listar() {
        List<Animal> lista = new ArrayList<>();
        for (Animal a : repository.listarTodos()) {
            if (a != null) lista.add(a);
        }
        return lista;
    }

    @GetMapping("/{id}")
    public Animal buscar(@PathVariable Long id) {
        return repository.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public String deletar(@PathVariable Long id) {
        return repository.deletar(id)
                ? "Animal removido com sucesso!"
                : "Animal não encontrado!";
    }

    @PatchMapping("/{id}")
    public String atualizarSituacao(@PathVariable Long id, @RequestBody Map<String, String> body) {
        String situacao = body.get("situacao");

        if (situacao == null)
            return "Situação inválida!";

        return repository.atualizarSituacao(id, situacao)
                ? "Situação atualizada!"
                : "Animal não encontrado!";
    }
}
