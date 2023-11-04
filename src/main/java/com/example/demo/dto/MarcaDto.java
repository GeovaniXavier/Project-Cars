package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MarcaDto {

    private Long id;

    @JsonProperty("nome_marca")
    private String nome;


}
