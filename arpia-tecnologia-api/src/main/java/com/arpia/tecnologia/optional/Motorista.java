package com.arpia.tecnologia.optional;

public class Motorista {

  private String nome;
  private Integer idade;
  private Caminhao caminhao;

  public Motorista(String nome, Integer idade, Caminhao caminhao) {
    this.nome = nome;
    this.idade = idade;
    this.caminhao = caminhao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getIdade() {
    return idade;
  }

  public void setIdade(Integer idade) {
    this.idade = idade;
  }

  public Caminhao getCaminhao() {
    return caminhao;
  }

  public void setCaminhao(Caminhao caminhao) {
    this.caminhao = caminhao;
  }

  @Override
  public String toString() {
    return "Motorista{" +
            "nome='" + nome + '\'' +
            ", idade=" + idade +
            ", caminhao=" + caminhao +
            '}';
  }
}