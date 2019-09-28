package com.arpia.tecnologia.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class VisaoDadoDiarioTO implements Serializable {

  private LocalDateTime data;
  private Integer diaSemana;
  private Integer totalAptos;
  private Integer bloqueados;
  private Integer totalOcupados;
  private Integer ocupadosGrupo;
  private Integer ocupadosIndividual;

  public LocalDateTime getData() {
    return data;
  }

  public void setData(LocalDateTime data) {
    this.data = data;
  }

  public Integer getDiaSemana() {
    return diaSemana;
  }

  public void setDiaSemana(Integer diaSemana) {
    this.diaSemana = diaSemana;
  }

  public Integer getTotalAptos() {
    return totalAptos;
  }

  public void setTotalAptos(Integer totalAptos) {
    this.totalAptos = totalAptos;
  }

  public Integer getBloqueados() {
    return bloqueados;
  }

  public void setBloqueados(Integer bloqueados) {
    this.bloqueados = bloqueados;
  }

  public Integer getTotalOcupados() {
    return totalOcupados;
  }

  public void setTotalOcupados(Integer totalOcupados) {
    this.totalOcupados = totalOcupados;
  }

  public Integer getOcupadosGrupo() {
    return ocupadosGrupo;
  }

  public void setOcupadosGrupo(Integer ocupadosGrupo) {
    this.ocupadosGrupo = ocupadosGrupo;
  }

  public Integer getOcupadosIndividual() {
    return ocupadosIndividual;
  }

  public void setOcupadosIndividual(Integer ocupadosIndividual) {
    this.ocupadosIndividual = ocupadosIndividual;
  }

  @Override
  public String toString() {
    return "VisaoDadoDiarioTO{" +
            "data=" + data +
            ", diaSemana=" + diaSemana +
            ", totalAptos=" + totalAptos +
            ", bloqueados=" + bloqueados +
            ", totalOcupados=" + totalOcupados +
            ", ocupadosGrupo=" + ocupadosGrupo +
            ", ocupadosIndividual=" + ocupadosIndividual +
            '}';
  }
}
