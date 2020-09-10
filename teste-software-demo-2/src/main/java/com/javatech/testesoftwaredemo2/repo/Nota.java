package com.javatech.testesoftwaredemo2.repo;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Nota {

  @Id
  private Integer id;
  @Column(columnDefinition = "data_venda")
  private LocalDate dataVenda;
  private Double valor;

  public Nota() {
  }

  public Nota(Integer id, LocalDate dataVenda, Double valor) {
    this.id = id;
    this.dataVenda = dataVenda;
    this.valor = valor;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LocalDate getDate() {
    return dataVenda;
  }

  public void setDate(LocalDate dataVenda) {
    this.dataVenda = dataVenda;
  }

  public Double getValor() {
    return valor;
  }

  public void setValor(Double valor) {
    this.valor = valor;
  }
}
