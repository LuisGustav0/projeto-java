package com.arpia.tecnologia.optional;

public class Caminhao {

  private String modelo;
  private Seguro seguro;

  public Caminhao(String modelo, Seguro seguro) {
    this.modelo = modelo;
    this.seguro = seguro;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public Seguro getSeguro() {
    return seguro;
  }

  public void setSeguro(Seguro seguro) {
    this.seguro = seguro;
  }

  @Override
  public String toString() {
    return "Caminhao{" +
            "modelo='" + modelo + '\'' +
            ", seguro=" + seguro +
            '}';
  }
}