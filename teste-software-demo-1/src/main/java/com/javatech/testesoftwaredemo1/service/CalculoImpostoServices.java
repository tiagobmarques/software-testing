package com.javatech.testesoftwaredemo1.service;

import org.springframework.stereotype.Service;

@Service
public class CalculoImpostoServices {

  public Double calculo(Double receita) {
    if (receita > 1000) {
      return receita * 0.03;
    }

    if (receita > 10000) {
      return receita * 0.04;
    }

    return receita * 0.02;
  }
}
