package com.senai.pratica.praticaum.models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="historico")
public class Historico {
    
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

@Column(name="id")
private Integer id;

@Column(name="responsavel")
private String responsavel;

@Column(name="data")
private LocalDate data;

@ManyToOne
@JoinColumn(name="movimentacao_id")
    private Movimentacao movimentacao;

public Historico() {
}

public Historico(Integer id, String responsavel, LocalDate data, Movimentacao movimentacao) {
    this.id = id;
    this.responsavel = responsavel;
    this.data = data;
    this.movimentacao = movimentacao;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public String getResponsavel() {
    return responsavel;
}

public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
}

public LocalDate getData() {
    return data;
}

public void setData(LocalDate data) {
    this.data = data;
}

public Movimentacao getMovimentacao() {
    return movimentacao;
}

public void setMovimentacao(Movimentacao movimentacao) {
    this.movimentacao = movimentacao;
}


    

}
