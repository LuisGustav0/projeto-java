package com.unialfa.solid.ocp.is_ocp.exemplo03.service;

import com.unialfa.solid.ocp.is_ocp.exemplo03.interafces.ITabelaPreco;
import com.unialfa.util.UtilNumero;

import java.math.BigDecimal;

public class TabelaPrecoClienteVipService implements ITabelaPreco {

    public BigDecimal descontoPara(BigDecimal valor) {
        if (UtilNumero.isValorMaior(valor, BigDecimal.valueOf(5000))) return BigDecimal.valueOf(0.08);
        if (UtilNumero.isValorMaior(valor, BigDecimal.valueOf(1000))) return BigDecimal.valueOf(0.06);

        return BigDecimal.ZERO;
    }
}
