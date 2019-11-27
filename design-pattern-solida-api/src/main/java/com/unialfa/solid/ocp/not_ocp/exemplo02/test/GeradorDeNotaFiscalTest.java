package com.unialfa.solid.ocp.not_ocp.exemplo02.test;

import com.unialfa.solid.ocp.not_ocp.exemplo02.model.Fatura;
import com.unialfa.solid.ocp.not_ocp.exemplo02.dao.NotaFiscalDao;
import com.unialfa.solid.ocp.not_ocp.exemplo02.services.EnviadorDeEmail;
import com.unialfa.solid.ocp.not_ocp.exemplo02.services.GeradorDeNotaFiscal;

import java.math.BigDecimal;

public class GeradorDeNotaFiscalTest {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.setCliente("Luis Gustavo");
        fatura.setValorMensal(BigDecimal.valueOf(1600.0));

        EnviadorDeEmail enviadorDeEmail = new EnviadorDeEmail();
        NotaFiscalDao notaFiscalDao = new NotaFiscalDao();

        GeradorDeNotaFiscal geradorDeNotaFiscal = new GeradorDeNotaFiscal(enviadorDeEmail,
                                                                          notaFiscalDao);

        geradorDeNotaFiscal.gera(fatura);
    }
}
