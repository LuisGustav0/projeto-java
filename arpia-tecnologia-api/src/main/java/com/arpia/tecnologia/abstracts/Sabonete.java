package com.arpia.tecnologia.abstracts;

import java.math.BigDecimal;

public class Sabonete extends ProdutoAbstract {

    @Override
    public String getNome() {
        return "Sabonete";
    }

    @Override
    public BigDecimal getValor() {
        return new BigDecimal("10.00");
    }
}
