package com.javatech.testesoftwaredemo2.api;

import com.javatech.testesoftwaredemo2.service.CalculoImpostoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculo-imposto")
public class CalculoImpostoController {

  @Autowired
  private CalculoImpostoServices calculoImpostoServices;

  @PostMapping
  public Double calculoImposto() {
    return calculoImpostoServices.calculo();
  }
}