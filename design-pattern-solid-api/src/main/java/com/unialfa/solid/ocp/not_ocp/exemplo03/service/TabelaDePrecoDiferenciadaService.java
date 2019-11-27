package com.unialfa.solid.ocp.not_ocp.exemplo03.service;

import com.unialfa.util.UtilNumero;

import java.math.BigDecimal;

public class TabelaDePrecoDiferenciadaService {

    public BigDecimal descontoPara(BigDecimal valor) {
        if (UtilNumero.isValorMaior(valor, BigDecimal.valueOf(5000))) return BigDecimal.valueOf(0.08);
        if (UtilNumero.isValorMaior(valor, BigDecimal.valueOf(1000))) return BigDecimal.valueOf(0.06);

        return BigDecimal.ZERO;
    }
}
