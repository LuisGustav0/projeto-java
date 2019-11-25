package com.unialfa.solid.dip.is_dip;

import java.math.BigDecimal;

public class ServicoPagamento {

    private Pagador pagador;
    private Pagavel pagavel;

    public ServicoPagamento(Pagador pagador,
                            Pagavel pagavel) {
        this.pagador = pagador;
        this.pagavel = pagavel;

        this.pagador.setPagavel(pagavel);
    }

    public BigDecimal pagar() {
        BigDecimal valorRemuneracao = this.pagador.getSalario();

        System.out.println("Estou pagando remuneração: ".concat(valorRemuneracao.toString()));

        return valorRemuneracao;
    }
}
