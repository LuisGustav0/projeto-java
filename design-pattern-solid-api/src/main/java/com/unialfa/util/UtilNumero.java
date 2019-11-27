package com.unialfa.util;

import java.math.BigDecimal;

public class UtilNumero {

    private static int MAIOR = 1;

    public static boolean isValorMaior(BigDecimal numero1, BigDecimal numero2) {
        if (numero1 == null || numero2 == null) {
            return false;
        }

        return numero1.compareTo(numero2) == MAIOR;
    }
}
