package com.unialfa.solid.srp.is_srp.exemplo02;

import java.math.BigDecimal;
import java.util.Optional;

public class CalculadoraDeSalario {

    public BigDecimal calcula(Funcionario funcionario) {
        TipoCargoE tipoCargoE = Optional.ofNullable(funcionario)
                                        .map(Funcionario::getCargo)
                                        .map(Cargo::getTipoCargoE)
                                        .orElseThrow(() -> new RuntimeException("Funcionario inválido!"));

        return tipoCargoE.getRegra().calcular(funcionario);
    }
}
