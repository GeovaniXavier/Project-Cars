package com.example.demo.dto;

import jakarta.persistence.Tuple;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class CustomResultDtoConverter implements Converter<Tuple, CustomResultDtoList> {

    @Override
    public CustomResultDtoList convert(Tuple tuple) {
        CustomResultDtoList customResultDtoList = new CustomResultDtoList();
        return customResultDtoList;
    }
}
