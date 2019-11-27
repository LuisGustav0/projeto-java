package com.unialfa.solid.srp.is_srp.exemplo02.test;

import com.unialfa.solid.srp.is_srp.exemplo02.enums.TipoCargoE;
import com.unialfa.solid.srp.is_srp.exemplo02.model.Cargo;
import com.unialfa.solid.srp.is_srp.exemplo02.model.Funcionario;
import com.unialfa.solid.srp.is_srp.exemplo02.service.CalcularSalarioService;

import java.math.BigDecimal;
import java.util.Optional;

public class CalcularSalarioServiceTest {

    private static Funcionario getFuncionario(TipoCargoE tipoCargoE,
                                              BigDecimal salarioBase) {
        Cargo cargo = new Cargo();
        cargo.setTipoCargoE(tipoCargoE);

        Funcionario funcionario = new Funcionario();
        funcionario.setCargo(cargo);
        funcionario.setSalarioBase(salarioBase);

        return funcionario;
    }

    private static String getDescricaoCargoFuncionario(Funcionario funcionario) {
        return Optional.ofNullable(funcionario)
                       .map(Funcionario::getCargo)
                       .map(Cargo::getTipoCargoE)
                       .map(String::valueOf)
                       .orElse("Não possui");
    }

    private static void calcularSalario(Funcionario funcionario) {
        CalcularSalarioService calculadoraDeSalario = new CalcularSalarioService();

        BigDecimal valorSalario = calculadoraDeSalario.calcula(funcionario);
        String descricaoTipoCargo = getDescricaoCargoFuncionario(funcionario);

        System.out.println(descricaoTipoCargo + ": " + valorSalario);
    }

    private static void testeFuncionarioNaoExiste() {
        try {
            TipoCargoE tipoCargoE = null;

            Funcionario funcionario = getFuncionario(tipoCargoE, BigDecimal.valueOf(2200.0));

            calcularSalario(funcionario);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    private static void testeFuncionarioDesenvolvedor() {
        TipoCargoE tipoCargoE = TipoCargoE.DESENVOLVEDOR;

        Funcionario funcionario = getFuncionario(tipoCargoE, BigDecimal.valueOf(5600.0));

        calcularSalario(funcionario);
    }

    private static void testeFuncionarioDba() {
        TipoCargoE tipoCargoE = TipoCargoE.DBA;

        Funcionario funcionario = getFuncionario(tipoCargoE, BigDecimal.valueOf(2800.0));

        calcularSalario(funcionario);
    }

    private static void testeFuncionarioTester() {
        TipoCargoE tipoCargoE = TipoCargoE.TESTER;

        Funcionario funcionario = getFuncionario(tipoCargoE, BigDecimal.valueOf(2200.0));

        calcularSalario(funcionario);
    }

    public static void main(String[] args) {
        testeFuncionarioNaoExiste();
        testeFuncionarioDesenvolvedor();
        testeFuncionarioDba();
        testeFuncionarioTester();
    }
}
