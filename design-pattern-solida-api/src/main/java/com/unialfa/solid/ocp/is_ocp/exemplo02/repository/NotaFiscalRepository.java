package com.unialfa.solid.ocp.is_ocp.exemplo02;

public class NotaFiscalRepository implements INotaFiscalAfterService {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Salvar nota fiscal no banco");
    }
}
