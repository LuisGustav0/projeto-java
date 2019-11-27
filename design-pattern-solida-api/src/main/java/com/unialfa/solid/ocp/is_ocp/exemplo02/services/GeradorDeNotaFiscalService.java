package com.unialfa.solid.ocp.is_ocp.exemplo02;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public class GeradorDeNotaFiscal {

    private List<INotaFiscalAfterService> listaAcaoAposGerarNota;

    public GeradorDeNotaFiscal(List<INotaFiscalAfterService> listaAcaoAposGerarNota) {
        this.listaAcaoAposGerarNota = listaAcaoAposGerarNota;
    }

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

        listaAcaoAposGerarNota.forEach(acaoAposGerarNota -> acaoAposGerarNota.executa(notaFiscal));

        return notaFiscal;
    }
}
