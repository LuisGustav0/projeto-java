package com.unialfa.solid.srp.not_srp.exemplo02.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Funcionario {

    private BigDecimal salarioBase;
    private Cargo cargo;
}
