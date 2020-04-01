package com.arpia.tecnologia.abstracts;

public class TestAbstract {

    public static void main(String[] args) {
        ProdutoAbstract sabonete = new Sabonete();
        sabonete.imprimir();

        ProdutoAbstract detergente = new Detergente();
        detergente.imprimir();
    }
}
