package com.unialfa.solid.ocp.is_ocp.exemplo02.test;

import com.unialfa.solid.ocp.is_ocp.exemplo02.interfaces.INotaFiscalGerarAfterService;
import com.unialfa.solid.ocp.is_ocp.exemplo02.model.Fatura;
import com.unialfa.solid.ocp.is_ocp.exemplo02.repository.NotaFiscalRepository;
import com.unialfa.solid.ocp.is_ocp.exemplo02.services.EnviadorEmailService;
import com.unialfa.solid.ocp.is_ocp.exemplo02.services.GeradorDeNotaFiscalService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class GeradorDeNotaFiscalServiceTest {

    public static void main(String[] args) {
        Fatura fatura = new Fatura();
        fatura.setCliente("Luis Gustavo");
        fatura.setValorMensal(BigDecimal.valueOf(1600.0));

        NotaFiscalRepository notaFiscalRepository = new NotaFiscalRepository();
        EnviadorEmailService enviadorEmailService = new EnviadorEmailService();

        List<INotaFiscalGerarAfterService> listaNotaFiscalAfterService = Arrays.asList(
                notaFiscalRepository,
                enviadorEmailService
        );

        GeradorDeNotaFiscalService geradorDeNotaFiscalService = new GeradorDeNotaFiscalService(listaNotaFiscalAfterService);
        geradorDeNotaFiscalService.gera(fatura);
    }
}
