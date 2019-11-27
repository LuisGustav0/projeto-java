package com.unialfa.solid.lsp.is_lsp;

public class ArquivoTxt extends Arquivo implements ArquivoLer,
                                                   ArquivoEscrever {

    public void ler() {
        System.out.println("ArquivoTxt Lendo...");
    }

    public void escrever() {
        System.out.println("ArquivoTxt Escrevendo...");
    }
}
