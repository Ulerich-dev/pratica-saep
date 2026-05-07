package com.senai.pratica.praticaum.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.pratica.praticaum.models.Historico;
import com.senai.pratica.praticaum.repositories.HistoricoRepository;

@Service
public class HistoricoService {
    @Autowired
    public HistoricoRepository historicoRepository;

     public Historico salvar(Historico historico) {
        return historicoRepository.save(historico);
    }
     public Long count(){
        return historicoRepository.count();
    }
}
