package com.unialfa.solid.ocp.not_ocp.exemplo03.service;

import com.unialfa.util.UtilNumero;

import java.math.BigDecimal;

public class TabelaDePrecoPadraoService {

    public BigDecimal descontoPara(BigDecimal valor) {
        if (UtilNumero.isValorMaior(valor, BigDecimal.valueOf(5000))) return BigDecimal.valueOf(0.03);
        if (UtilNumero.isValorMaior(valor, BigDecimal.valueOf(1000))) return BigDecimal.valueOf(0.05);

        return BigDecimal.ZERO;
    }
}
