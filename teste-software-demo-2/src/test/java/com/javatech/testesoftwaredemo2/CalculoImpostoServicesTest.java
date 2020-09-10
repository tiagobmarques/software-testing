package com.javatech.testesoftwaredemo2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

import com.javatech.testesoftwaredemo2.repo.Nota;
import com.javatech.testesoftwaredemo2.repo.NotaRepository;
import com.javatech.testesoftwaredemo2.service.CalculoImpostoServices;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.Mockito;

@TestInstance(Lifecycle.PER_CLASS)
public class CalculoImpostoServicesTest {

  private NotaRepository mockNotaRepository;
  private CalculoImpostoServices calculoImpostoServices;

  @BeforeAll
  void inicializador() {
    mockNotaRepository = Mockito.mock(NotaRepository.class);
    calculoImpostoServices = new CalculoImpostoServices(mockNotaRepository);
  }

  @Test
  public void deveCalcularImpostoComBaseNaReceitaAte999() {
    List<Nota> notaList = new ArrayList<Nota>();
    notaList.add(new Nota(1, LocalDate.of(2020,1,1), 500D));

    when(mockNotaRepository
             .findAll())
        .thenReturn(notaList);

    Double valorDoImposto = calculoImpostoServices.calculo();

    assertEquals(valorDoImposto, 10);
  }

  @Test
  public void deveCalcularImpostoComBaseNaReceitaApartirDe1000() {
    Double receita = 10000.00;

    List<Nota> notaList = new ArrayList<Nota>();
    notaList.add(new Nota(1, LocalDate.of(2020,1,1), 5000D));
    notaList.add(new Nota(2, LocalDate.of(2020,1,1), 5000D));

    when(mockNotaRepository
             .findAll())
        .thenReturn(notaList);

    Double valorDoImposto = calculoImpostoServices.calculo();

    assertEquals(valorDoImposto, 300);
  }
}
