package com.javatech.testesoftwaredemo1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.javatech.testesoftwaredemo1.service.CalculoImpostoServices;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(Lifecycle.PER_CLASS)
public class CalculoImpostoServicesTest {

  private CalculoImpostoServices calculoImpostoServices;

  @BeforeAll
  void inicializador() {
    calculoImpostoServices = new CalculoImpostoServices();
  }

  @Test
  public void deveCalcularImpostoComBaseNaReceitaAte999() {
    Double receita = 500.00;

    Double valorDoImposto = calculoImpostoServices.calculo(receita);

    assertEquals(valorDoImposto, 10);
  }

  @Test
  public void deveCalcularImpostoComBaseNaReceitaApartirDe1000() {
    Double receita = 10000.00;

    Double valorDoImposto = calculoImpostoServices.calculo(receita);

    assertEquals(valorDoImposto, 300);
  }
}
