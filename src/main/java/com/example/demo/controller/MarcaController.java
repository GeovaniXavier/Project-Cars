package com.example.demo.controller;

import com.example.demo.entity.Marca;
import com.example.demo.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/marca")
public class MarcaController {


    @Autowired
    private MarcaService marcaService;

    @GetMapping
    public ResponseEntity<?> findAll() {
        return ResponseEntity.ok().body(marcaService.findAll());
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Marca marca) {
        return ResponseEntity.ok().body(marcaService.save(marca));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Marca marca) {
        return ResponseEntity.ok().body(marcaService.update(id, marca));
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteById(@PathVariable Long id) {
        marcaService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
