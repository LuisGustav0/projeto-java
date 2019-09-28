package com.arpia.tecnologia.produto;

import com.arpia.tecnologia.interfaces.Calculo;
import com.arpia.tecnologia.model.Produto;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;

public class ProdutoTeste {

  private static BigDecimal newBigDecimal(Object valor) {
    return new BigDecimal(String.valueOf(valor));
  }

  @Test
  public void calculo() {
    Calculo calculo = BigDecimal::multiply;
    System.out.println(calculo.executar(newBigDecimal(2), newBigDecimal(2)));
  }

  @Test
  public void onBinaryOperatorAndBiFunction() {
    BinaryOperator<Double> media = (Double nota1, Double nota2) -> (nota1 + nota2) / 2;
    System.out.println(media.apply(9.8, 5.7));

    BiFunction<Double, Double, String> resultado = (Double nota1, Double nota2) -> {
      double notaFinal = (nota1 + nota2) / 2;

      return notaFinal >= 7 ? "Aprovado" : "Reprovado";
    };
    System.out.println(resultado.apply(6.0, 5.0));

    Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
    System.out.println(media.andThen(conceito).apply(9.7, 5.1));
  }

  @Test
  public void onBinaryOperator() {
    BinaryOperator<String> binaryOperator = (strNome, strSobreNome) -> strNome + " " + strSobreNome;
    System.out.println(binaryOperator.apply("Luis", "Gustavo"));
  }

  @Test
  public void onBiConsumer() {
    BiConsumer<String, Integer> biConsumer = (strNome, idade) -> System.out.println(strNome + " tem idade de " + idade);
    biConsumer.accept("Luis", 28);
  }

  @Test
  public void onBiFunction() {
    BiFunction<String, Integer, String> biFunction = (strNome, idade) -> strNome + " tem idade de " + idade;
    System.out.println(biFunction.apply("Luis", 28));
  }

  @Test
  public void onPredicate() {
    Predicate<Produto> isExpensive = produto -> produto.preco >= 750;
    Produto produto = new Produto("Produto1", 2850.10, 350);
    System.out.println("Produto expensive: " + isExpensive.test(produto));

    Predicate<Integer> isPar = num -> num % 2 == 0;
    Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

    System.out.println("Número é par e não possui 3 digitos: " + isPar.and(isTresDigitos).negate().test(12));
    System.out.println("Number é par ou possui 3 digitos: " + isPar.or(isTresDigitos).test(3));
  }

  @Test
  public void onConsumer() {
    Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);
    Produto produto = new Produto("Sabonete", 2850.10, 350);
    imprimir.accept(produto);
  }

  @Test
  public void onFunction() {
    Function<Integer, String> funcParOuImpar = (numero) -> numero % 2 == 0 ? "Par" : "Impar";
    System.out.println(funcParOuImpar.apply(5));

    Function<String, String> oResultado = valor -> "O resultado é: " + valor;

    Function<String, String> empolgado = valor -> valor.concat("!!!!");

    String resultado = funcParOuImpar.andThen(oResultado)
                                     .andThen(empolgado)
                                     .apply(5);
    System.out.println(resultado);
  }

  @Test
  public void onSupplier() {
    Supplier<List<String>> lista = () -> Arrays.asList("Thais", "Andre", "Luis", "Gustavo");

    System.out.println(lista.get());
  }

  @Test
  public void onUnaryOperator() {
    UnaryOperator<Integer> maisDois = numero -> numero + 2;
    UnaryOperator<Integer> vezesDois = numero -> numero * 2;
    UnaryOperator<Integer> aoQuadrado = numero -> numero * numero;

    int resultado = maisDois.andThen(vezesDois)
                            .andThen(aoQuadrado)
                            .apply(3);

    int resultado2 = aoQuadrado.andThen(vezesDois)
                               .andThen(maisDois)
                               .apply(3);

    System.out.println("Resultado: " + resultado);
    System.out.println("Resultado2: " + resultado2);
  }
}
