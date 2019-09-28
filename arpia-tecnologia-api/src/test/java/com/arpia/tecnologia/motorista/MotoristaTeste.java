package com.arpia.tecnologia.motorista;

import com.arpia.tecnologia.optional.Caminhao;
import com.arpia.tecnologia.optional.Motorista;
import com.arpia.tecnologia.optional.MotoristaService;
import com.arpia.tecnologia.optional.Seguro;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Optional;

import static org.junit.Assert.assertFalse;

public class MotoristaTeste {

  @Test(expected = NullPointerException.class)
  public void exemploNullPointerException() {
    Motorista motorista = MotoristaService.findByNome("Jose");

    String cobertura = motorista.getCaminhao().getSeguro().getCobertura();
    cobertura = cobertura != null ? cobertura : "Sem seguro";

    System.out.println(cobertura);
  }

  @Test
  public void exemploEvitarNullPointerException() {
    Motorista motorista = MotoristaService.findByNome("José");

    String cobertura = "Sem seguro";

    if (motorista != null) {
      Caminhao caminhao = motorista.getCaminhao();
      if (caminhao != null) {
        Seguro seguro = caminhao.getSeguro();
        if (seguro != null) {
          cobertura = seguro.getCobertura();
        }
      }
    }

    System.out.println(cobertura);
  }

  @Test
  public void exemploUsarOptional() {
    Seguro seguro = new Seguro("Total com franquia reduzida", new BigDecimal("600"));
    Optional seguroOpcional = Optional.of(seguro);

    System.out.println(seguroOpcional.get());
  }

  @Test
  public void exemploUsarOptionalComValorNull() {
    Seguro seguro = null;
    Optional seguroOpcional = Optional.ofNullable(seguro);

    assertFalse(seguroOpcional.isPresent());
  }

  @Test
  public void imprimirTelaValor() {
    Seguro seguro = new Seguro("Total com franquia reduzida", new BigDecimal("600"));
    Optional<Seguro> seguroOpcional = Optional.of(seguro);

    seguroOpcional.map(Seguro::getValorFranquia)
                  .ifPresent(System.out::println);
  }

  @Test
  public void validarOptionalPedro() {
    Motorista motorista = MotoristaService.findByNome("Pedro");

    String modelo = Optional.ofNullable(motorista)
                            .map(Motorista::getCaminhao)
                            .map(Optional::ofNullable)
                            .map(Optional::get)
                            .map(Caminhao::getModelo)
                            .orElse("Modelo padrão Caminhão");

    BigDecimal valorFranquia = Optional.ofNullable(motorista)
                                       .map(Motorista::getCaminhao)
                                       .map(Optional::ofNullable)
                                       .map(Optional::get)
                                       .map(Caminhao::getSeguro)
                                       .map(Optional::ofNullable)
                                       .map(Optional::get)
                                       .map(Seguro::getValorFranquia)
                                       .orElse(new BigDecimal(12000));

    System.out.println("Caminhão Pedro modelo: " + modelo + " possui valor franquia de " + valorFranquia);
  }

  @Test
  public void validarOptionalJose() {
    Motorista motorista = MotoristaService.findByNome("Jose");

    String modelo = Optional.ofNullable(motorista)
                            .map(Motorista::getCaminhao)
                            .map(Optional::ofNullable)
                            .map(Optional::get)
                            .map(Caminhao::getModelo)
                            .orElse("Modelo padrão Caminhão");

    BigDecimal valorFranquia = Optional.ofNullable(motorista)
                                       .map(Motorista::getCaminhao)
                                       .map(Optional::ofNullable)
                                       .map(Optional::get)
                                       .map(Caminhao::getSeguro)
                                       .map(Optional::ofNullable)
                                       .map(Optional::get)
                                       .map(Seguro::getValorFranquia)
                                       .orElse(new BigDecimal(12000));

    System.out.println("Caminhão modelo: " + modelo + " possui valor franquia de " + valorFranquia);
  }

  @Test
  public void validarOptionalAndre() {
    Motorista motorista = MotoristaService.findByNome("Andre");

    String modelo = Optional.ofNullable(motorista)
                            .map(Motorista::getCaminhao)
                            .map(Optional::ofNullable)
                            .map(Optional::get)
                            .map(Caminhao::getModelo)
                            .orElse("Modelo padrão Caminhão");

    BigDecimal valorFranquia = Optional.ofNullable(motorista)
                                       .map(Motorista::getCaminhao)
                                       .map(Optional::ofNullable)
                                       .map(Optional::get)
                                       .map(Caminhao::getSeguro)
                                       .map(Optional::ofNullable)
                                       .map(Optional::get)
                                       .map(Seguro::getValorFranquia)
                                       .orElse(new BigDecimal(12000));

    System.out.println("Caminhão Andre Modelo: " + modelo + " possui valor franquia de " + valorFranquia);
  }
}
