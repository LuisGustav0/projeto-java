package com.unialfa.solid.dip.is_dip;

import java.math.BigDecimal;

public class Pagamento implements Pagador {

    private Pagavel pagavel;

    @Override
    public void setPagavel(Pagavel pagavel) {
        this.pagavel = pagavel;
    }

    @Override
    public String getNome() {
        return this.pagavel.getNome();
    }

    @Override
    public BigDecimal getSalario() {
        return this.pagavel.getRemuneracao();
    }
}
