package com.unialfa.solid.ocp.not_ocp.exemplo02.dao;

import com.unialfa.solid.ocp.not_ocp.exemplo02.model.NotaFiscal;

public class NotaFiscalDao {

    public void persiste(NotaFiscal notaFiscal) {
        System.out.println("Salvar nota fiscal no banco: " + notaFiscal.getId());
    }
}
