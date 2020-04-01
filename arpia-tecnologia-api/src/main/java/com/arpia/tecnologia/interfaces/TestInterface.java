package com.arpia.tecnologia.interfaces;

public class TestInterface {

    public static void main(String[] args) {
        IProduto sabonete = new Sabonete();
        sabonete.imprimir();

        IProduto detergente = new Detergente();
        detergente.imprimir();
    }
}
