package com.unialfa.solid.ocp.not_ocp.exemplo03.service;

import com.unialfa.solid.ocp.not_ocp.exemplo03.model.Compra;

import java.math.BigDecimal;

public class CalculadoraPrecoService {

    public BigDecimal calcula(Compra compra) {
        FreteService correios = new FreteService();

        BigDecimal descontoTabela = BigDecimal.ZERO;

        if (compra.getCliente().getDataCadastro().getYear() <= 2000) {
            TabelaDePrecoDiferenciadaService tabela = new TabelaDePrecoDiferenciadaService();
            descontoTabela = tabela.descontoPara(compra.getProduto().getValor());
        } else {
            TabelaDePrecoPadraoService tabela = new TabelaDePrecoPadraoService();
            descontoTabela = tabela.descontoPara(compra.getProduto().getValor());
        }

        BigDecimal frete = correios.para(compra.getCidade());
        BigDecimal desconto = BigDecimal.ONE.subtract(descontoTabela);
        BigDecimal valorProdutoComDesconto = compra.getProduto().getValor().multiply(desconto);
        BigDecimal valorComFrete = valorProdutoComDesconto.add(frete);

        return valorComFrete;
    }
}
