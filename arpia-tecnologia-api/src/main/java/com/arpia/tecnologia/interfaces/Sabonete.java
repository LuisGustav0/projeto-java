package com.arpia.tecnologia.interfaces;

import java.math.BigDecimal;

public class Sabonete implements IProduto, IProdutoMais100Compras {

    @Override
    public String getNome() {
        return "Sabonete";
    }

    @Override
    public BigDecimal getValor() {
        return new BigDecimal("10.00");
    }
}
