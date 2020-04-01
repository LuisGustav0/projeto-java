package com.arpia.tecnologia.abstracts;

import java.math.BigDecimal;

abstract class ProdutoAbstract {

    ProdutoAbstract() {
        System.out.println("constructor: ProdutoAbstract");
    }

    protected abstract String getNome();

    protected abstract BigDecimal getValor();

    int getIdade() {
        return 25;
    };

    void imprimir() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Valor: " + this.getValor());
        System.out.println("Idade: " + this.getIdade());
    }
}
