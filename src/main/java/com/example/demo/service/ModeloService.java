package com.example.demo.service;

import com.example.demo.entity.Modelo;
import com.example.demo.repository.CarroRepository;
import com.example.demo.repository.ModeloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModeloService {

    @Autowired
    private ModeloRepository modeloRepository;

    @Autowired
    private CarroRepository carroRepository;

    public Modelo save(Modelo modelo) {
        return modeloRepository.save(modelo);
    }

    public List<Modelo> findAll() {
        return modeloRepository.findAll();
    }

    public void deleteById(Long id) {
        modeloRepository.deleteById(id);
    }

    public Modelo update(Long id, Modelo modelo) {
        Modelo modelo1 = modeloRepository.findById(id).get();
        modelo1.setNome(modelo.getNome());
        modelo1.setMarca(modelo.getMarca());
        modelo1.setValorFipe(modelo.getValorFipe());
        return modeloRepository.save(modelo1);
    }
}
