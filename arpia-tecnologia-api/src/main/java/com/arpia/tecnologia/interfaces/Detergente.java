package com.arpia.tecnologia.interfaces;

import java.math.BigDecimal;

public class Detergente implements IProduto {
    @Override
    public String getNome() {
        return "Detergente";
    }

    @Override
    public BigDecimal getValor() {
        return new BigDecimal("3.68");
    }
}
