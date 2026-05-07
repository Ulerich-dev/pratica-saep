package com.senai.pratica.praticaum.models;

import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="medicamento")
public class Medicamentos {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name= "id")
    private Integer id;

    @Column(name= "lote")
    private int lote;

    @Column(name= "data_validade")
    private LocalDate data_validade;

    @Column(name= "tipo_medicamento")
    private String tipo_medicamento;
    
    @Column(name= "condicao")
    private String condicao;

    public Medicamentos() {
    }

    public Medicamentos(Integer id, int lote, LocalDate data_validade, String tipo_medicamento, String condicao) {
        this.id = id;
        this.lote = lote;
        this.data_validade = data_validade;
        this.tipo_medicamento = tipo_medicamento;
        this.condicao = condicao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        this.lote = lote;
    }

    public LocalDate getData_validade() {
        return data_validade;
    }

    public void setData_validade(LocalDate data_validade) {
        this.data_validade = data_validade;
    }

    public String getTipo_medicamento() {
        return tipo_medicamento;
    }

    public void setTipo_medicamento(String tipo_medicamento) {
        this.tipo_medicamento = tipo_medicamento;
    }

    public String getCondicao() {
        return condicao;
    }

    public void setCondicao(String condicao) {
        this.condicao = condicao;
    }



}
