package com.example.bemestaranimal.service;

import com.example.bemestaranimal.dto.PessoaDTO;
import com.example.bemestaranimal.entity.Pessoa;
import com.example.bemestaranimal.repository.PessoaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public List<Pessoa> listar() {
        return repository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    // Método que retorna lista de PessoaDTO
    public List<PessoaDTO> listarDTO() {
        return repository.findAll()
                .stream()
                .map(p -> new PessoaDTO(p.getId(), p.getNome(), p.getEmail(), p.getTipoPessoa()))
                .collect(Collectors.toList());
    }
}
