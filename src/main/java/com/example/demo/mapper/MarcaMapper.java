package com.example.demo.mapper;

import com.example.demo.dto.MarcaDto;
import com.example.demo.entity.Marca;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class MarcaMapper {


    private static ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static Marca converteMarcaDtoEmMarca(MarcaDto marcaDto) {
        return modelMapper().map(marcaDto, Marca.class);
    }

    public static MarcaDto converteMarcaEmMarcaDto(Marca marca) {
        return modelMapper().map(marca, MarcaDto.class);
    }

    public static List<MarcaDto> converteListMarcaEmListMarcaDto(List<Marca> marcaList) {
        return marcaList.stream().map(MarcaMapper::converteMarcaEmMarcaDto).collect(Collectors.toList());
    }

}
