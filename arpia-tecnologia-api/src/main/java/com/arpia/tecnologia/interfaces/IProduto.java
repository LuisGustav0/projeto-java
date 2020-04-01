package com.arpia.tecnologia.interfaces;

import java.math.BigDecimal;

public interface IProduto extends IProdutoPromocao {

    String getNome();
    BigDecimal getValor();

    default void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Valor: " + this.getValor());
    }
}
