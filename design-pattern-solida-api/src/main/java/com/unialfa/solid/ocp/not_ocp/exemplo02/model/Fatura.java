package com.unialfa.solid.ocp.not_ocp.exemplo02.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Fatura {

    private String cliente;
    private BigDecimal valorMensal;
}
