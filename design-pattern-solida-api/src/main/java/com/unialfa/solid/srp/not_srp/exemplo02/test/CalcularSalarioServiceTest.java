package com.unialfa.solid.srp.not_srp.exemplo02;

import java.math.BigDecimal;

public class FuncionarioTest {

    private static Funcionario getFunconario(TipoCargoE tipoCargoE,
                                             BigDecimal salarioBase) {
        Cargo cargo = new Cargo();
        cargo.setTipoCargoE(tipoCargoE);

        Funcionario funcionario = new Funcionario();
        funcionario.setCargo(cargo);
        funcionario.setSalarioBase(salarioBase);

        return funcionario;
    }

    private static void calcularSalario(Funcionario funcionario) {
        CalculadoraDeSalario calculadoraDeSalario = new CalculadoraDeSalario();
        BigDecimal valorSalario = calculadoraDeSalario.calcula(funcionario);

        System.out.println(funcionario.getCargo().getTipoCargoE() + ": " + valorSalario);
    }

    private static void testeFuncionarioDesenvolvedor() {
        TipoCargoE tipoCargoE = TipoCargoE.DESENVOLVEDOR;

        Funcionario funcionario = getFunconario(tipoCargoE, BigDecimal.valueOf(5600.0));

        calcularSalario(funcionario);
    }

    private static void testeFuncionarioDba() {
        TipoCargoE tipoCargoE = TipoCargoE.DBA;

        Funcionario funcionario = getFunconario(tipoCargoE, BigDecimal.valueOf(2800.0));

        calcularSalario(funcionario);
    }

    private static void testeFuncionarioTester() {
        TipoCargoE tipoCargoE = TipoCargoE.TESTER;

        Funcionario funcionario = getFunconario(tipoCargoE, BigDecimal.valueOf(2200.0));

        calcularSalario(funcionario);
    }

    private static void testeFuncionarioNaoExiste() {
        try {
            TipoCargoE tipoCargoE = null;

            Funcionario funcionario = getFunconario(tipoCargoE, BigDecimal.valueOf(2200.0));

            calcularSalario(funcionario);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        testeFuncionarioDesenvolvedor();
        testeFuncionarioDba();
        testeFuncionarioTester();
        testeFuncionarioNaoExiste();
    }
}
