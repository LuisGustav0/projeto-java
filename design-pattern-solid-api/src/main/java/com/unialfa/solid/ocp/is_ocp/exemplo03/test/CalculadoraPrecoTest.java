package com.unialfa.solid.ocp.is_ocp.exemplo03.test;

import com.unialfa.solid.ocp.is_ocp.exemplo03.model.Compra;
import com.unialfa.solid.ocp.is_ocp.exemplo03.service.CalculadoraPrecoService;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CalculadoraPrecoTest {

    private static void calcularPreco(String mensagem, Compra compra) {
        CalculadoraPrecoService calculadoraDePrecos = new CalculadoraPrecoService();
        BigDecimal valor = calculadoraDePrecos.calcula(compra);

        System.out.println(mensagem + valor);
    }

    private static void comprarEmSaoPauloTest() {
        Compra compra = new Compra(LocalDate.now(), "Goiania", BigDecimal.valueOf(1600.0));

        calcularPreco("Cliente com desconto tabela padrao: ", compra);
    }

    private static void comprarEmGoianiaTest() {
        Compra compra = new Compra(LocalDate.now().minusYears(19), "Sao Paulo", BigDecimal.valueOf(1600.0));

        calcularPreco("Cliente com desconto tabela diferenciada: ", compra);
    }

    public static void main(String[] args) {
        comprarEmSaoPauloTest();
        comprarEmGoianiaTest();
    }
}
