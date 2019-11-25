package com.unialfa.solid.dip.not_dip;

import java.math.BigDecimal;

public class Pagamento {

    private Funcionario funcionario;

    public BigDecimal getSalario() {
        if ("FRONT-END".equals(funcionario.getCargo())) {

        } else if ("BACK-END".equals(funcionario.getCargo())) {

        } else if ("FULL-STACK".equals(funcionario.getCargo())) {

        }

        return funcionario.getComissao();
    }
}
