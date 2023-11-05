package com.example.demo.mapper;

import com.example.demo.dto.ModeloDto;
import com.example.demo.entity.Modelo;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

public class ModeloMapper {

    public static ModelMapper modelMapper() {
        return new ModelMapper();
    }

    public static Modelo converteModeloDTOEmModelo(ModeloDto modeloDTO) {
        return modelMapper().map(modeloDTO, Modelo.class);

    }

    public static ModeloDto converteModeloEmModeloDTO(Modelo modelo) {
        return modelMapper().map(modelo, ModeloDto.class);

    }

    public static List<ModeloDto> converteListaModeloDTOEmListaModelo(List<Modelo> listaModelo) {
        return listaModelo.stream().map(ModeloMapper::converteModeloEmModeloDTO).collect(Collectors.toList());
    }
}
