package com.arpia.tecnologia.gof.criacao.singleton;

public class TesteSingleton {

    public static void main(String[] args) {
        Janela janela = Janela.getIstance();
        janela.setVisible(true);
    }
}
