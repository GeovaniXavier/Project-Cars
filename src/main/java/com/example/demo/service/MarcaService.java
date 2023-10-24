package com.example.demo.service;

import com.example.demo.entity.Marca;
import com.example.demo.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MarcaService {


    @Autowired
    private MarcaRepository marcaRepository;

    public Marca save(Marca marca) {
        return marcaRepository.save(marca);
    }

    public List<Marca> findAll() {
        return marcaRepository.findAll();
    }

    public Marca update(Long id, Marca marca) {
        Marca marca1 = marcaRepository.findById(id).get();
        marca1.setNome(marca.getNome());
        return marcaRepository.save(marca1);
    }

    public void deleteById(Long id) {
        marcaRepository.deleteById(id);
    }


}
