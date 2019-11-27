package com.unialfa.solid.ocp.not_ocp.exemplo02.services;

import com.unialfa.solid.ocp.is_ocp.exemplo02.model.NotaFiscal;

public class NotaFiscalDao {

    public void persiste(NotaFiscal notaFiscal) {
        notaFiscal.setId(1);

        System.out.println("Salvar nota fiscal no banco" + notaFiscal.getId());
    }
}
