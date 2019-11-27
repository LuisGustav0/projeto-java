package com.unialfa.solid.ocp.is_ocp.exemplo02.services;

import com.unialfa.solid.ocp.is_ocp.exemplo02.model.Fatura;
import com.unialfa.solid.ocp.is_ocp.exemplo02.model.NotaFiscal;
import com.unialfa.solid.ocp.is_ocp.exemplo02.repository.NotaFiscalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class GeradorDeNotaFiscalService {

    @Autowired
    private NotaFiscalRepository notaFiscalRepository;

    @Autowired
    private EnviadorEmailService enviadorEmailService;

    private BigDecimal getImpostoSimplesSobreO(BigDecimal valor) {
        return valor.multiply(BigDecimal.valueOf(0.06));
    }

    private BigDecimal getValorMensal(Fatura fatura) {
        return Optional.ofNullable(fatura)
                       .map(Fatura::getValorMensal)
                       .orElse(BigDecimal.ZERO);
    }

    public NotaFiscal gera(Fatura fatura) {
        BigDecimal valor = getValorMensal(fatura);
        BigDecimal imposto = getImpostoSimplesSobreO(valor);

        NotaFiscal notaFiscal = new NotaFiscal(valor, imposto);

        this.notaFiscalRepository.save(notaFiscal);
        this.enviadorEmailService.enviar(notaFiscal);

        return notaFiscal;
    }
}
