package com.unialfa.solid.ocp.is_ocp.exemplo03.service;

import com.unialfa.solid.ocp.is_ocp.exemplo03.interafces.IServicoEntrega;

import java.math.BigDecimal;

public class FreteCorreioService implements IServicoEntrega {

    public BigDecimal para(String cidade) {
        if ("SAO PAULO".equals(cidade.toUpperCase())) {
            return BigDecimal.valueOf(15);
        }

        return BigDecimal.valueOf(30);
    }
}
