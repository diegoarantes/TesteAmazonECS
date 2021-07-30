package com.example.testeamazonecs.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Pessoa {
    private String nome;
    private Integer idade;
    private String cidade;
}
