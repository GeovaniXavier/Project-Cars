package com.example.demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class CustomDtoList {


    @JsonProperty("cars")
    private CustomDto customDto;

    public CustomDtoList() {
    }

    public CustomDtoList(CustomDto customDto) {
        this.customDto = customDto;
    }

    public CustomDto getCustomDto() {
        return customDto;
    }

    public void setCustomDto(CustomDto customDto) {
        this.customDto = customDto;
    }
}
