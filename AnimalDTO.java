package com.example.bemestaranimal.dto;

import com.example.bemestaranimal.entity.enums.StatusAnimal;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AnimalDTO {
    private Long id;
    private String nome;
    private String especie;
    private Integer idade;
    private StatusAnimal status;
}
