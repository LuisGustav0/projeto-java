package com.unialfa.solid.ocp.is_ocp.exemplo02.service;

import com.unialfa.solid.ocp.is_ocp.exemplo02.model.Fatura;
import com.unialfa.solid.ocp.is_ocp.exemplo02.services.GeradorDeNotaFiscalService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class GeradorDeNotaFiscalServiceTest {

    @Autowired
    private GeradorDeNotaFiscalService geradorDeNotaFiscalService;

    @Test
    public void gerarNotaFiscalComSucesso() {
        Fatura fatura = new Fatura();
        fatura.setCliente("Luis Gustavo");
        fatura.setValorMensal(BigDecimal.valueOf(1600.0));

        this.geradorDeNotaFiscalService.gera(fatura);
    }
}
