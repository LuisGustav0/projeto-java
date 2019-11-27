package com.unialfa.solid.ocp.is_ocp.exemplo02.services;

import com.unialfa.solid.ocp.is_ocp.exemplo02.interfaces.INotaFiscalGerarAfterService;
import com.unialfa.solid.ocp.is_ocp.exemplo02.model.NotaFiscal;

public class EnviadorEmailService implements INotaFiscalGerarAfterService {

    @Override
    public void executa(NotaFiscal notaFiscal) {
        System.out.println("Enviar email da nota fiscal: " + notaFiscal.getId());
    }
}
