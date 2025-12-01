package com.example.petcare.service;

import com.example.petcare.model.pessoas.Cliente;
import com.example.petcare.repository.ClienteRepositoryArray;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    private ClienteRepositoryArray repo = new ClienteRepositoryArray();

    public void cadastrar(Cliente c) { repo.salvar(c); }
    public Cliente buscar(Long id) { return repo.buscarPorId(id); }
}
