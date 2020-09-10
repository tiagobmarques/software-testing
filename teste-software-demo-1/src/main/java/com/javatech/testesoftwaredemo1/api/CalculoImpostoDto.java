package com.javatech.testesoftwaredemo1.api;

import java.io.Serializable;

public class CalculoImpostoDto implements Serializable {

  private Double receita;

  public CalculoImpostoDto() {
  }

  public CalculoImpostoDto(Double receita) {
    this.receita = receita;
  }

  public Double getReceita() {
    return receita;
  }
}
