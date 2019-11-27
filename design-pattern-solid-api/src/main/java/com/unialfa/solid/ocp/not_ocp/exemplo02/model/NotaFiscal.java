package com.unialfa.solid.ocp.not_ocp.exemplo02.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class NotaFiscal {

    private int id;
    private BigDecimal valorBruto;
    private BigDecimal valorImposto;

    public NotaFiscal(BigDecimal valorBruto,
                      BigDecimal valorImposto) {
        this.valorBruto = valorBruto;
        this.valorImposto = valorImposto;
    }
}
