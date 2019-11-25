package com.unialfa.solid.dip.is_dip;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Funcionario implements Pagavel {

    private String cargo;
    private BigDecimal salario;
    private BigDecimal comissao;

    @Override
    public String getNome() {
        return this.cargo;
    }

    @Override
    public BigDecimal getRemuneracao() {
        if ("VENDEDOR".equals(this.cargo)) {
            return this.comissao;
        }

        return this.salario.add(this.comissao);
    }
}
