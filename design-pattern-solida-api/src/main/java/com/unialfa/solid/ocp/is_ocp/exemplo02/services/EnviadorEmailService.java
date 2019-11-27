package com.unialfa.solid.ocp.is_ocp.exemplo02;

public class EnviadorEmail implements INotaFiscalAfterService {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("envia email da nf " + notaFiscal.getId());
    }
}
