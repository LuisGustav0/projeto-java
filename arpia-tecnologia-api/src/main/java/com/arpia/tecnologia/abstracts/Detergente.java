package com.arpia.tecnologia.abstracts;

import java.math.BigDecimal;

public class Detergente extends ProdutoAbstract {

    @Override
    public String getNome() {
        return "Detergente";
    }

    @Override
    public BigDecimal getValor() {
        return new BigDecimal("3.68");
    }
}
