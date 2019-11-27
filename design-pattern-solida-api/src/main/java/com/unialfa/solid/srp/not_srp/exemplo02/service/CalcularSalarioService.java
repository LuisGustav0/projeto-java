package com.unialfa.solid.srp.not_srp.exemplo02.service;

import com.unialfa.solid.srp.not_srp.exemplo02.model.Funcionario;
import com.unialfa.solid.srp.not_srp.exemplo02.enums.TipoCargoE;
import com.unialfa.util.UtilNumero;

import java.math.BigDecimal;

public class CalcularSalarioService {

    public BigDecimal calcula(Funcionario funcionario) {
        if (TipoCargoE.DESENVOLVEDOR.equals(funcionario.getCargo().getTipoCargoE())) {
            return dezOuVintePorcento(funcionario);
        }

        if (TipoCargoE.DBA.equals(funcionario.getCargo().getTipoCargoE()) ||
                TipoCargoE.TESTER.equals(funcionario.getCargo().getTipoCargoE())) {
            return quinzeOuVinteCincoPorcento(funcionario);
        }

        throw new RuntimeException("funcionario invalido");
    }

    private BigDecimal dezOuVintePorcento(Funcionario funcionario) {
        if (UtilNumero.isValorMaior(funcionario.getSalarioBase(), BigDecimal.valueOf(3000.0))) {
            return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.8));
        } else {
            return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.9));
        }
    }

    private BigDecimal quinzeOuVinteCincoPorcento(Funcionario funcionario) {
        if (UtilNumero.isValorMaior(funcionario.getSalarioBase(), BigDecimal.valueOf(2000.0))) {
            return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.75));
        } else {
            return funcionario.getSalarioBase().multiply(BigDecimal.valueOf(0.85));
        }
    }
}
