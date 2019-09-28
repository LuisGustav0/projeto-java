package com.arpia.tecnologia.rmview.painel.visao;

public enum DiaDaSemanaE {
  DOMINGO(1),
  SEGUNDA(2),
  TERÇA(3),
  QUARTA(4),
  QUINTA(5),
  SEXTA(6),
  SÁBADO(7);

  private int diaDaSemana;

  DiaDaSemanaE(int diaDaSemana) {
    this.diaDaSemana = diaDaSemana;
  }

  public int getDiaDaSemana() {
    return diaDaSemana;
  }
}
