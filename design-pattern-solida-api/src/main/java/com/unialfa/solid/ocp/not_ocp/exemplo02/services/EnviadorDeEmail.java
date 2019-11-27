package com.unialfa.solid.ocp.not_ocp.exemplo02.services;

import com.unialfa.solid.ocp.not_ocp.exemplo02.model.NotaFiscal;

public class EnviadorDeEmail {

    public void enviar(NotaFiscal notaFiscal) {
        System.out.println("Enviar email da nota fiscal: " + notaFiscal.getId());
    }
}
