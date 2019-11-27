package com.unialfa.solid.srp.is_srp.exemplo02.service;

import com.unialfa.solid.srp.is_srp.exemplo02.interfaces.IRegraDeCalculo;
import com.unialfa.solid.srp.is_srp.exemplo02.model.Funcionario;
import com.unialfa.util.UtilNumero;

import java.math.BigDecimal;

public class QuinzeOuVinteECincoPorCentoService implements IRegraDeCalculo {

    @Override
    public BigDecimal calcular(Funcionario funcionario) {
        if (UtilNumero.isValorMaior(funcionario.getSalarioBase(), BigDecimal.valueOf(2000.0))) {
            return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.75));
        }

        return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.85));
    }
}
