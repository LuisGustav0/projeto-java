package com.unialfa.solid.lsp.is_lsp;

import java.util.Optional;

public class Arquivo {

    static boolean isArquivoLer(Arquivo arquivo) {
        return Optional.ofNullable(arquivo)
                       .filter(ArquivoLer.class::isInstance)
                       .isPresent();
    }

    static boolean isArquivoEscrever(Arquivo arquivo) {
        return Optional.ofNullable(arquivo)
                       .filter(ArquivoEscrever.class::isInstance)
                       .isPresent();
    }
}
