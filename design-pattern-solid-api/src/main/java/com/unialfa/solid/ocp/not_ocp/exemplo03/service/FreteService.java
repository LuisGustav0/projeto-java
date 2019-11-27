package com.unialfa.solid.ocp.not_ocp.exemplo03.service;

import java.math.BigDecimal;

public class FreteService {

    public BigDecimal para(String cidade) {

        //        if(REGRA 1) { ... }
        if ("SAO PAULO".equals(cidade.toUpperCase())) {
            return BigDecimal.valueOf(15);
        }
        //Fim REGRA 1

//        if(REGRA 2) { ... }
//        if(REGRA 3) { ...}
//        if(REGRA 4) { ...}

        return BigDecimal.valueOf(30);
    }
}
