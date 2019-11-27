package com.unialfa.solid.ocp.is_ocp.exemplo02;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Fatura {

    private String cliente;
    private BigDecimal valorMensal;
}
