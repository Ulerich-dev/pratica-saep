package com.senai.pratica.praticaum.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pratica.praticaum.models.Medicamentos;
import com.senai.pratica.praticaum.repositories.MedicamentosRepository;

@Service
public class MedicamentosService {
    @Autowired
    public MedicamentosRepository medicamentosRepository;
    public Long count(){
        return medicamentosRepository.count();
    }

    public Medicamentos salvar (Medicamentos medicamentos){
        return medicamentosRepository.save(medicamentos);
    }

    public boolean delete(Integer id) {
        Medicamentos medicamentos = medicamentosRepository.findById(id).get();
        if(medicamentos != null) {
            medicamentosRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
