package com.arpia.tecnologia.teste;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class A {

    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.preco = 10;

        Produto p2 = new Produto();
        p2.preco = 30;

        List<Produto> l = Arrays.asList(p1, p2);

        int r = l.stream()
                 .map(produto -> produto.preco)
                 .filter(Objects::nonNull)
                 .reduce(0, (preco1, preco2) -> preco1 + preco2);

        System.out.println(r);

    }

    static class Produto {
        Integer preco;
    }
}
