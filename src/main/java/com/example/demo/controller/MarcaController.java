package com.example.demo.controller;

import com.example.demo.dto.MarcaDto;
import com.example.demo.entity.Marca;
import com.example.demo.mapper.MarcaMapper;
import com.example.demo.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/marca")
public class MarcaController {


    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public ResponseEntity<List<MarcaDto>> findAll() {
        List<Marca> marcaList = marcaService.findAll();
        List<MarcaDto> marcaDtoList = MarcaMapper.converteListMarcaEmListMarcaDto(marcaList);
        return ResponseEntity.ok().body(marcaDtoList);
    }

    @PostMapping
    public ResponseEntity<MarcaDto> save(@RequestBody MarcaDto marcaDto) {

        Marca marca = MarcaMapper.converteMarcaDtoEmMarca(marcaDto);
        Marca savedMarca = marcaService.save(marca);
        MarcaDto savedMarcaDto = MarcaMapper.converteMarcaEmMarcaDto(savedMarca);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedMarcaDto);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MarcaDto> update(@PathVariable Long id, @RequestBody MarcaDto marcaDto) {
        Marca marca = MarcaMapper.converteMarcaDtoEmMarca(marcaDto);
        Marca updatedMarca = marcaService.update(id, marca);
        MarcaDto updatedMarcaDto = MarcaMapper.converteMarcaEmMarcaDto(updatedMarca);
        return ResponseEntity.ok().body(updatedMarcaDto);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<MarcaDto> deleteById(@PathVariable Long id) {
        marcaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
