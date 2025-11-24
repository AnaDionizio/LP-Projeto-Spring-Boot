package com.example.bemestaranimal.service;

import com.example.bemestaranimal.entity.Adocao;
import com.example.bemestaranimal.entity.Animal;
import com.example.bemestaranimal.entity.enums.StatusAdocao;
import com.example.bemestaranimal.entity.enums.StatusAnimal;
import com.example.bemestaranimal.repository.AdocaoRepository;
import com.example.bemestaranimal.dto.AdocaoDTO;
import com.example.bemestaranimal.dto.AnimalDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdocaoService {

    private final AdocaoRepository adocaoRepository;

    public AdocaoService(AdocaoRepository adocaoRepository) {
        this.adocaoRepository = adocaoRepository;
    }

    // Listar todas as adoções
    public List<Adocao> listar() {
        return adocaoRepository.findAll();
    }

    // Listar todas as adoções com DTO
    public List<AdocaoDTO> listarDTO() {
        return adocaoRepository.findAll()
                .stream()
                .map(adocao -> new AdocaoDTO(
                        adocao.getId(),
                        adocao.getAdotante().getNome(), // pega apenas o nome
                        adocao.getStatus(),
                        new AnimalDTO(
                                adocao.getAnimal().getId(),
                                adocao.getAnimal().getNome(),
                                adocao.getAnimal().getEspecie(),
                                adocao.getAnimal().getIdade(),
                                adocao.getAnimal().getStatus()
                        )
                ))
                .collect(Collectors.toList());
    }

    // Salvar nova adoção, bloqueando se o animal já estiver adotado
    public Adocao salvar(Adocao adocao) {
        Animal animal = adocao.getAnimal();
        if (animal.getStatus() == StatusAnimal.ADOTADO) {
            throw new RuntimeException("Animal já está adotado!");
        }
        adocao.setStatus(StatusAdocao.PENDENTE);
        return adocaoRepository.save(adocao);
    }

    // Aprovar adoção
    public Adocao aprovar(Long id) {
        Adocao adocao = adocaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Adoção não encontrada!"));
        adocao.setStatus(StatusAdocao.APROVADA);
        adocao.getAnimal().setStatus(StatusAnimal.ADOTADO);
        return adocaoRepository.save(adocao);
    }

    // Cancelar adoção
    public Adocao cancelar(Long id) {
        Adocao adocao = adocaoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Adoção não encontrada!"));
        adocao.setStatus(StatusAdocao.CANCELADA);
        return adocaoRepository.save(adocao);
    }
}

