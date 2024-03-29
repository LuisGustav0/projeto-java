package com.unialfa.solid.ocp.not_ocp.exemplo02.services;

import com.unialfa.solid.ocp.not_ocp.exemplo02.model.Fatura;
import com.unialfa.solid.ocp.not_ocp.exemplo02.model.NotaFiscal;
import com.unialfa.solid.ocp.not_ocp.exemplo02.dao.NotaFiscalDao;

import java.math.BigDecimal;

public class GeradorDeNotaFiscal {

   private final EnviadorDeEmail enviadorDeEmail;
   private final NotaFiscalDao notaFiscalDao;

    public GeradorDeNotaFiscal(EnviadorDeEmail enviadorDeEmail,
                               NotaFiscalDao notaFiscalDao) {
        this.enviadorDeEmail = enviadorDeEmail;
        this.notaFiscalDao = notaFiscalDao;
    }

    private BigDecimal impostoSimplesSobreO(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.06));
    }

    public NotaFiscal gera(Fatura fatura) {
        BigDecimal valor = fatura.getValorMensal();

        NotaFiscal notaFiscal = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        enviadorDeEmail.enviar(notaFiscal);
        notaFiscalDao.persiste(notaFiscal);

        return notaFiscal;
    }
}
