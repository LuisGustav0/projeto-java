package com.unialfa.solid.dip.not_dip.exemplo01;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class Pagamento {

    /*
    *
    *  Pagamento esta dependendo de Funcionario
    *
     */
    private Funcionario funcionario;

    public BigDecimal getSalario() {
        if ("VENDEDOR".equals(funcionario.getCargo())) {
            return funcionario.getComissao();
        }

        return funcionario.getSalario();
    }
}
