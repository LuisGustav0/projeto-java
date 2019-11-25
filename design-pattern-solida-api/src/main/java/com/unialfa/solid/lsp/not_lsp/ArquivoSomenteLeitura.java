package com.unialfa.solid.lsp.not_lsp;

import jdk.jshell.spi.ExecutionControl.NotImplementedException;

public class ArquivoSomenteLeitura extends Arquivo {

    @Override
    void ler() {
        System.out.println("ArquivoSomenteLeitura Lendo...");
    }

    @Override
    void escrever() {
        System.err.println(new NotImplementedException("ArquivoSomenteLeitura Não é possivel escrever..."));
    }
}
