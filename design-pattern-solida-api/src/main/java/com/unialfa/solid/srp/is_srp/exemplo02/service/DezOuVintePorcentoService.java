package com.unialfa.solid.srp.is_srp.exemplo02;

import com.unialfa.util.UtilNumero;

import java.math.BigDecimal;

public class DezOuVintePorcento implements IRegraDeCalculo {

    @Override
    public BigDecimal calcular(Funcionario funcionario) {
        if (UtilNumero.isValorMaior(funcionario.getSalarioBase(), BigDecimal.valueOf(3000.0))) {
            return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.8));
        }

        return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.9));
    }
}
