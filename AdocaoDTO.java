package com.example.bemestaranimal.dto;

import com.example.bemestaranimal.entity.enums.StatusAdocao;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdocaoDTO {
    private Long id;
    private String adotanteNome; // Apenas o nome da pessoa
    private StatusAdocao status;
    private AnimalDTO animal;
}
