package com.arpia.tecnologia.rmview.painel.visao;

import java.io.Serializable;
import java.math.BigDecimal;

public class Relatorio2 implements Serializable {
  private String mediaPorDiaDaSemana;
  private BigDecimal segundaFeira;
  private BigDecimal tercaFeira;
  private BigDecimal quartaFeira;
  private BigDecimal quintaFeira;
  private BigDecimal sextaFeira;
  private BigDecimal sabado;
  private BigDecimal domingo;
  private String mediaPorDiaDoPeriodo;

  public String getMediaPorDiaDaSemana() {
    return mediaPorDiaDaSemana;
  }

  public void setMediaPorDiaDaSemana(String mediaPorDiaDaSemana) {
    this.mediaPorDiaDaSemana = mediaPorDiaDaSemana;
  }

  public BigDecimal getSegundaFeira() {
    return segundaFeira;
  }

  public void setSegundaFeira(BigDecimal segundaFeira) {
    this.segundaFeira = segundaFeira;
  }

  public BigDecimal getTercaFeira() {
    return tercaFeira;
  }

  public void setTercaFeira(BigDecimal tercaFeira) {
    this.tercaFeira = tercaFeira;
  }

  public BigDecimal getQuartaFeira() {
    return quartaFeira;
  }

  public void setQuartaFeira(BigDecimal quartaFeira) {
    this.quartaFeira = quartaFeira;
  }

  public BigDecimal getQuintaFeira() {
    return quintaFeira;
  }

  public void setQuintaFeira(BigDecimal quintaFeira) {
    this.quintaFeira = quintaFeira;
  }

  public BigDecimal getSextaFeira() {
    return sextaFeira;
  }

  public void setSextaFeira(BigDecimal sextaFeira) {
    this.sextaFeira = sextaFeira;
  }

  public BigDecimal getSabado() {
    return sabado;
  }

  public void setSabado(BigDecimal sabado) {
    this.sabado = sabado;
  }

  public BigDecimal getDomingo() {
    return domingo;
  }

  public void setDomingo(BigDecimal domingo) {
    this.domingo = domingo;
  }

  public String getMediaPorDiaDoPeriodo() {
    return mediaPorDiaDoPeriodo;
  }

  public void setMediaPorDiaDoPeriodo(String mediaPorDiaDoPeriodo) {
    this.mediaPorDiaDoPeriodo = mediaPorDiaDoPeriodo;
  }
}
