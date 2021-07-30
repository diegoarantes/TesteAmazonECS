package com.example.testeamazonecs.controller;

import com.example.testeamazonecs.model.Pessoa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class PessoaController {

    @GetMapping
    public List<Pessoa> listar() {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(Pessoa.builder()
                .nome("Diego Arantes")
                .idade(27)
                .cidade("Curitiba-PR")
                .build());

        pessoas.add(Pessoa.builder()
                .nome("Lays Pauline")
                .idade(27)
                .cidade("Guairaçá-PR")
                .build());

        return pessoas;
    }

}
