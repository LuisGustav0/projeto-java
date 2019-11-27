package com.unialfa.solid.dip.not_dip.exemplo02;

import java.math.BigDecimal;

public class Frete {

    public BigDecimal para(String cidade) {
        if ("SAO PAULO".equals(cidade.toUpperCase())) {
            return BigDecimal.valueOf(15);
        }

        return BigDecimal.valueOf(30);
    }
}
