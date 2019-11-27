package com.unialfa.solid.ocp.is_ocp.exemplo02.repository;

import com.unialfa.solid.ocp.is_ocp.exemplo02.interfaces.INotaFiscalAfterService;
import com.unialfa.solid.ocp.is_ocp.exemplo02.model.NotaFiscal;

public class NotaFiscalRepository implements INotaFiscalAfterService {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Salvar nota fiscal no banco");
    }
}
