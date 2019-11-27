package com.unialfa.solid.ocp.is_ocp.exemplo02.services;

import com.unialfa.solid.ocp.is_ocp.exemplo02.interfaces.INotaFiscalAfterService;
import com.unialfa.solid.ocp.is_ocp.exemplo02.model.NotaFiscal;

public class EnviadorEmailService implements INotaFiscalAfterService {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("envia email da nf " + notaFiscal.getId());
    }
}
