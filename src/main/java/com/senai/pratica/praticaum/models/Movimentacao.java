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
@Table(name="movimentacao")
public class Movimentacao {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    @Column(name="id")
    private Integer id;

    @Column(name="entrada_medicamento")
    private LocalDate entrada_medicamento;

    @Column(name="saida_medicamento")
    private LocalDate saida_medicamento;

    @Column(name="tipo_medicamento")
    private String tipo_medicamento;

    @Column(name="registro_detalhado")
    private String registro_detalhado;

   @ManyToOne
   @JoinColumn(name="medicamento_id")
    private Medicamentos medicamento;

   public Movimentacao() {
   }

   public Movimentacao(Integer id, LocalDate entrada_medicamento, LocalDate saida_medicamento, String tipo_medicamento,
        String registro_detalhado, Medicamentos medicamento) {
    this.id = id;
    this.entrada_medicamento = entrada_medicamento;
    this.saida_medicamento = saida_medicamento;
    this.tipo_medicamento = tipo_medicamento;
    this.registro_detalhado = registro_detalhado;
    this.medicamento = medicamento;
   }

   public Integer getId() {
    return id;
   }

   public void setId(Integer id) {
    this.id = id;
   }

   public LocalDate getEntrada_medicamento() {
    return entrada_medicamento;
   }

   public void setEntrada_medicamento(LocalDate entrada_medicamento) {
    this.entrada_medicamento = entrada_medicamento;
   }

   public LocalDate getSaida_medicamento() {
    return saida_medicamento;
   }

   public void setSaida_medicamento(LocalDate saida_medicamento) {
    this.saida_medicamento = saida_medicamento;
   }

   public String getTipo_medicamento() {
    return tipo_medicamento;
   }

   public void setTipo_medicamento(String tipo_medicamento) {
    this.tipo_medicamento = tipo_medicamento;
   }

   public String getRegistro_detalhado() {
    return registro_detalhado;
   }

   public void setRegistro_detalhado(String registro_detalhado) {
    this.registro_detalhado = registro_detalhado;
   }

   public Medicamentos getMedicamento() {
    return medicamento;
   }

   public void setMedicamento(Medicamentos medicamento) {
    this.medicamento = medicamento;
   }


}
