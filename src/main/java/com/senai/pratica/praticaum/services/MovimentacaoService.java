package com.senai.pratica.praticaum.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.senai.pratica.praticaum.models.Movimentacao;
import com.senai.pratica.praticaum.repositories.MovimentacaoRepository;

@Service

public class MovimentacaoService {
    @Autowired
    public MovimentacaoRepository movimentacaoRepository;

     public Movimentacao salvar (Movimentacao movimentacao){
        return movimentacaoRepository.save(movimentacao);
    }
    
}
