package com.arpia.tecnologia.rmview.painel.visao;

import java.io.Serializable;
import java.math.BigDecimal;

public class Relatorio1 implements Serializable {

  private String data;
  private Integer diaSemana;
  private Integer totalAptos;
  private Integer bloqueados;
  private Integer totalOcupados;
  private Integer ocupadosGrupo;
  private Integer ocupadosIndividual;
  private Integer disponiveis;
  private Integer cortesia;
  private Integer usoDaCasa;
  private Integer dayUse;
  private Integer permutas;
  private Integer percentualOcupacao;
  private Integer percentualOcupacaoGrupo;
  private BigDecimal percentualOcupacaoIndividual;
  private BigDecimal diariaMediaTotal;
  private BigDecimal diariaMediaGrupo;
  private BigDecimal diariaMediaIndividual;
  private BigDecimal receitaHospedagemTotal;
  private BigDecimal receitaHospedagemGrupo;
  private BigDecimal receitaHospedagemIndividual;
  private BigDecimal revPar;
  private BigDecimal receitaExtraTotal;
  private BigDecimal receitaExtraGrupo;
  private BigDecimal receitaExtraIndividual;
  private Integer totalAdultos;
  private Integer totalCriancas;
  private BigDecimal adultosApto;
  private Integer criancasApto;
  private BigDecimal pessoasApto;
  private Integer walkin;
  private Integer noShow;
  private Integer permanenciaEstendida;
  private Integer saidaAntecipada;
  private Integer cancelamentosNoDiaCheckIn;
  private Integer reservarNoDiaCheckIn;
  private Integer sobraAptosNoDia;
  private Integer recusas;
  private Integer checkInDia;
  private Integer checkOutDia;

  public String getData() {
    return data;
  }

  public void setData(String data) {
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

  public Integer getDisponiveis() {
    return disponiveis;
  }

  public void setDisponiveis(Integer disponiveis) {
    this.disponiveis = disponiveis;
  }

  public Integer getCortesia() {
    return cortesia;
  }

  public void setCortesia(Integer cortesia) {
    this.cortesia = cortesia;
  }

  public Integer getUsoDaCasa() {
    return usoDaCasa;
  }

  public void setUsoDaCasa(Integer usoDaCasa) {
    this.usoDaCasa = usoDaCasa;
  }

  public Integer getDayUse() {
    return dayUse;
  }

  public void setDayUse(Integer dayUse) {
    this.dayUse = dayUse;
  }

  public Integer getPermutas() {
    return permutas;
  }

  public void setPermutas(Integer permutas) {
    this.permutas = permutas;
  }

  public Integer getPercentualOcupacao() {
    return percentualOcupacao;
  }

  public void setPercentualOcupacao(Integer percentualOcupacao) {
    this.percentualOcupacao = percentualOcupacao;
  }

  public Integer getPercentualOcupacaoGrupo() {
    return percentualOcupacaoGrupo;
  }

  public void setPercentualOcupacaoGrupo(Integer percentualOcupacaoGrupo) {
    this.percentualOcupacaoGrupo = percentualOcupacaoGrupo;
  }

  public BigDecimal getPercentualOcupacaoIndividual() {
    return percentualOcupacaoIndividual;
  }

  public void setPercentualOcupacaoIndividual(BigDecimal percentualOcupacaoIndividual) {
    this.percentualOcupacaoIndividual = percentualOcupacaoIndividual;
  }

  public BigDecimal getDiariaMediaTotal() {
    return diariaMediaTotal;
  }

  public void setDiariaMediaTotal(BigDecimal diariaMediaTotal) {
    this.diariaMediaTotal = diariaMediaTotal;
  }

  public BigDecimal getDiariaMediaGrupo() {
    return diariaMediaGrupo;
  }

  public void setDiariaMediaGrupo(BigDecimal diariaMediaGrupo) {
    this.diariaMediaGrupo = diariaMediaGrupo;
  }

  public BigDecimal getDiariaMediaIndividual() {
    return diariaMediaIndividual;
  }

  public void setDiariaMediaIndividual(BigDecimal diariaMediaIndividual) {
    this.diariaMediaIndividual = diariaMediaIndividual;
  }

  public BigDecimal getReceitaHospedagemTotal() {
    return receitaHospedagemTotal;
  }

  public void setReceitaHospedagemTotal(BigDecimal receitaHospedagemTotal) {
    this.receitaHospedagemTotal = receitaHospedagemTotal;
  }

  public BigDecimal getReceitaHospedagemGrupo() {
    return receitaHospedagemGrupo;
  }

  public void setReceitaHospedagemGrupo(BigDecimal receitaHospedagemGrupo) {
    this.receitaHospedagemGrupo = receitaHospedagemGrupo;
  }

  public BigDecimal getReceitaHospedagemIndividual() {
    return receitaHospedagemIndividual;
  }

  public void setReceitaHospedagemIndividual(BigDecimal receitaHospedagemIndividual) {
    this.receitaHospedagemIndividual = receitaHospedagemIndividual;
  }

  public BigDecimal getRevPar() {
    return revPar;
  }

  public void setRevPar(BigDecimal revPar) {
    this.revPar = revPar;
  }

  public BigDecimal getReceitaExtraTotal() {
    return receitaExtraTotal;
  }

  public void setReceitaExtraTotal(BigDecimal receitaExtraTotal) {
    this.receitaExtraTotal = receitaExtraTotal;
  }

  public BigDecimal getReceitaExtraGrupo() {
    return receitaExtraGrupo;
  }

  public void setReceitaExtraGrupo(BigDecimal receitaExtraGrupo) {
    this.receitaExtraGrupo = receitaExtraGrupo;
  }

  public BigDecimal getReceitaExtraIndividual() {
    return receitaExtraIndividual;
  }

  public void setReceitaExtraIndividual(BigDecimal receitaExtraIndividual) {
    this.receitaExtraIndividual = receitaExtraIndividual;
  }

  public Integer getTotalAdultos() {
    return totalAdultos;
  }

  public void setTotalAdultos(Integer totalAdultos) {
    this.totalAdultos = totalAdultos;
  }

  public Integer getTotalCriancas() {
    return totalCriancas;
  }

  public void setTotalCriancas(Integer totalCriancas) {
    this.totalCriancas = totalCriancas;
  }

  public BigDecimal getAdultosApto() {
    return adultosApto;
  }

  public void setAdultosApto(BigDecimal adultosApto) {
    this.adultosApto = adultosApto;
  }

  public Integer getCriancasApto() {
    return criancasApto;
  }

  public void setCriancasApto(Integer criancasApto) {
    this.criancasApto = criancasApto;
  }

  public BigDecimal getPessoasApto() {
    return pessoasApto;
  }

  public void setPessoasApto(BigDecimal pessoasApto) {
    this.pessoasApto = pessoasApto;
  }

  public Integer getWalkin() {
    return walkin;
  }

  public void setWalkin(Integer walkin) {
    this.walkin = walkin;
  }

  public Integer getNoShow() {
    return noShow;
  }

  public void setNoShow(Integer noShow) {
    this.noShow = noShow;
  }

  public Integer getPermanenciaEstendida() {
    return permanenciaEstendida;
  }

  public void setPermanenciaEstendida(Integer permanenciaEstendida) {
    this.permanenciaEstendida = permanenciaEstendida;
  }

  public Integer getSaidaAntecipada() {
    return saidaAntecipada;
  }

  public void setSaidaAntecipada(Integer saidaAntecipada) {
    this.saidaAntecipada = saidaAntecipada;
  }

  public Integer getCancelamentosNoDiaCheckIn() {
    return cancelamentosNoDiaCheckIn;
  }

  public void setCancelamentosNoDiaCheckIn(Integer cancelamentosNoDiaCheckIn) {
    this.cancelamentosNoDiaCheckIn = cancelamentosNoDiaCheckIn;
  }

  public Integer getReservarNoDiaCheckIn() {
    return reservarNoDiaCheckIn;
  }

  public void setReservarNoDiaCheckIn(Integer reservarNoDiaCheckIn) {
    this.reservarNoDiaCheckIn = reservarNoDiaCheckIn;
  }

  public Integer getSobraAptosNoDia() {
    return sobraAptosNoDia;
  }

  public void setSobraAptosNoDia(Integer sobraAptosNoDia) {
    this.sobraAptosNoDia = sobraAptosNoDia;
  }

  public Integer getRecusas() {
    return recusas;
  }

  public void setRecusas(Integer recusas) {
    this.recusas = recusas;
  }

  public Integer getCheckInDia() {
    return checkInDia;
  }

  public void setCheckInDia(Integer checkInDia) {
    this.checkInDia = checkInDia;
  }

  public Integer getCheckOutDia() {
    return checkOutDia;
  }

  public void setCheckOutDia(Integer checkOutDia) {
    this.checkOutDia = checkOutDia;
  }

}