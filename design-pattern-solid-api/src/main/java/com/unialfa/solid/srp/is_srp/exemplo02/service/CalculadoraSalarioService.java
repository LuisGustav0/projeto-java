package com.unialfa.solid.srp.is_srp.exemplo02.service;

import com.unialfa.solid.srp.is_srp.exemplo02.enums.TipoCargoE;
import com.unialfa.solid.srp.is_srp.exemplo02.model.Cargo;
import com.unialfa.solid.srp.is_srp.exemplo02.model.Funcionario;

import java.math.BigDecimal;
import java.util.Optional;

public class CalculadoraSalarioService {

    public BigDecimal calcular(Funcionario funcionario) {
        TipoCargoE tipoCargoE = Optional.ofNullable(funcionario)
                                        .map(Funcionario::getCargo)
                                        .map(Cargo::getTipoCargoE)
                                        .orElseThrow(() -> new RuntimeException("Funcionario inválido!"));

        return tipoCargoE.getRegra().calcular(funcionario);
    }
}
