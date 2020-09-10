package com.javatech.testesoftwaredemo2.service;

import com.javatech.testesoftwaredemo2.repo.Nota;
import com.javatech.testesoftwaredemo2.repo.NotaRepository;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CalculoImpostoServices {

  private NotaRepository notaRepository;

  public CalculoImpostoServices(NotaRepository notaRepository) {
    this.notaRepository = notaRepository;
  }

  public Double calculo() {
    Double receita = 0D;

    List<Nota> notaList = notaRepository.findAll();

    for (Nota nota : notaList) {
      receita += nota.getValor();
    }

    if (receita > 1000) {
      return receita * 0.03;
    }

    if (receita > 10000) {
      return receita * 0.04;
    }

    return receita * 0.02;
  }
}
