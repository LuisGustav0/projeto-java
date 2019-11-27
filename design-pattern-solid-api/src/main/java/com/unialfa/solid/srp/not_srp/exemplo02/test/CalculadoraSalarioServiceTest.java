package com.unialfa.solid.srp.not_srp.exemplo02.test;

import com.unialfa.solid.srp.not_srp.exemplo02.enums.TipoCargoE;
import com.unialfa.solid.srp.not_srp.exemplo02.model.Cargo;
import com.unialfa.solid.srp.not_srp.exemplo02.model.Funcionario;
import com.unialfa.solid.srp.not_srp.exemplo02.service.CalculadoraSalarioService;

import java.math.BigDecimal;

public class CalculadoraSalarioServiceTest {

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
        CalculadoraSalarioService calculadoraDeSalario = new CalculadoraSalarioService();
        BigDecimal valorSalario = calculadoraDeSalario.calcula(funcionario);

        System.out.println(funcionario.getCargo().getTipoCargoE() + ": " + valorSalario);
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
    
    public static void main(String[] args) {
        testeFuncionarioNaoExiste();
        testeFuncionarioDesenvolvedor();
        testeFuncionarioDba();
        testeFuncionarioTester();
    }
}
