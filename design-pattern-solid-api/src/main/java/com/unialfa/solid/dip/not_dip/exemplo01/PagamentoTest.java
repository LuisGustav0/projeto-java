package com.unialfa.solid.dip.not_dip.exemplo01;

import java.math.BigDecimal;

public class PagamentoTest {

    public static void main(String[] args) {
        Funcionario funcionarioBackEnd = new Funcionario();
        funcionarioBackEnd.setCargo("BACK-END");
        funcionarioBackEnd.setComissao(BigDecimal.ZERO);
        funcionarioBackEnd.setSalario(new BigDecimal("2.500"));

        Funcionario funcionarioFrontEnd = new Funcionario();
        funcionarioFrontEnd.setCargo("FRONT-END");
        funcionarioFrontEnd.setComissao(BigDecimal.ZERO);
        funcionarioFrontEnd.setSalario(new BigDecimal("3.200"));

        Funcionario funcionarioFullStack = new Funcionario();
        funcionarioFullStack.setCargo("FULL-STACK");
        funcionarioFullStack.setComissao(new BigDecimal("1.200"));
        funcionarioFullStack.setSalario(new BigDecimal("5.000"));

        Funcionario funcionarioVendedor = new Funcionario();
        funcionarioVendedor.setCargo("VENDEDOR");
        funcionarioVendedor.setComissao(BigDecimal.ZERO);
        funcionarioVendedor.setComissao(new BigDecimal("4.000"));

        Pagamento pagamento = new Pagamento();
        pagamento.setFuncionario(funcionarioBackEnd);
        System.out.println(pagamento.getFuncionario().getCargo().concat(" recebe salario: ".concat(pagamento.getSalario().toString())));
        System.out.println("#################################");

        pagamento.setFuncionario(funcionarioFrontEnd);
        System.out.println(pagamento.getFuncionario().getCargo().concat(" recebe salario: ".concat(pagamento.getSalario().toString())));
        System.out.println("#################################");

        pagamento.setFuncionario(funcionarioFullStack);
        System.out.println(pagamento.getFuncionario().getCargo().concat(" recebe salario: ".concat(pagamento.getSalario().toString())));
        System.out.println("#################################");

        pagamento.setFuncionario(funcionarioVendedor);
        System.out.println(pagamento.getFuncionario().getCargo().concat(" recebe salario: ".concat(pagamento.getSalario().toString())));
        System.out.println("#################################");
    }
}
