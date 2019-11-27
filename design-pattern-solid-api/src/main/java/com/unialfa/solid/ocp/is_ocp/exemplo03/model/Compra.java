package com.unialfa.solid.ocp.is_ocp.exemplo03.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Compra implements Serializable {

    private Cliente cliente;
    private String cidade;
    private Produto produto;

    public Compra(LocalDate dataCadastro,
                  String cidade,
                  BigDecimal valor) {
        Cliente cliente = new Cliente();
        cliente.setDataCadastro(dataCadastro);

        Produto produto = new Produto();
        produto.setValor(valor);

        this.setCliente(cliente);
        this.setCidade(cidade);
        this.setProduto(produto);
    }
}
