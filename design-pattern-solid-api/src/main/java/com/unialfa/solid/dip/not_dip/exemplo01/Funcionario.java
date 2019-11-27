package com.unialfa.solid.dip.not_dip.exemplo01;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Funcionario {

    private String cargo;
    private BigDecimal salario;
    private BigDecimal comissao;

    public BigDecimal getSalario() {
        return this.salario.add(this.comissao);
    }
}
