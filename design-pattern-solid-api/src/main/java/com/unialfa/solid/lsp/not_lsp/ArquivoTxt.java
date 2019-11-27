package com.unialfa.solid.lsp.not_lsp;

public class ArquivoTxt extends Arquivo {

    @Override
    void ler() {
        System.out.println("ArquivoTxt Lendo...");
    }

    @Override
    void escrever() {
        System.out.println("ArquivoTxt Escrevendo...");
    }
}
