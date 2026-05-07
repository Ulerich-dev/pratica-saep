package com.senai.pratica.praticaum.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.pratica.praticaum.models.Historico;



@Repository
public interface HistoricoRepository extends JpaRepository<Historico, Integer>{
    
}

