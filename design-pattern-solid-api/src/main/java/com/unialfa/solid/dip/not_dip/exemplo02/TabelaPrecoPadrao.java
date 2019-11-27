package com.unialfa.solid.dip.not_dip.exemplo02;

import com.unialfa.util.UtilNumero;

import java.math.BigDecimal;

public class TabelaPrecoPadrao {

    public BigDecimal descontoPara(BigDecimal valor) {
        if (UtilNumero.isValorMaior(valor, BigDecimal.valueOf(1000))) return BigDecimal.valueOf(0.05);
        if (UtilNumero.isValorMaior(valor, BigDecimal.valueOf(1000))) return BigDecimal.valueOf(0.03);

        return BigDecimal.ZERO;
    }
}
