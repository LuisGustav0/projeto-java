package com.arpia.tecnologia.optional;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MotoristaService {

  private static Map<String, Motorista> get() {
    Map<String, Motorista> listaMotorista = new HashMap<>();

    Seguro seguroAndre = new Seguro("Parcial - não cobre roubo", new BigDecimal("5000"));
    Caminhao caminhaoAndre = new Caminhao("Modelo Andre", seguroAndre);
    Motorista motoristaAndre = new Motorista("Andre", 40, caminhaoAndre);

    Caminhao caminhaoJose = new Caminhao("Modelo Jose", null);
    Motorista motoristaJose = new Motorista("José", 25, caminhaoJose);

    Motorista motoristaPedro = null;

    listaMotorista.put("Andre", motoristaAndre);
    listaMotorista.put("Jose", motoristaJose);
    listaMotorista.put("Pedro", motoristaPedro);

    return listaMotorista;
  }

  public static Motorista findByNome(String nome) {
    Map<String, Motorista> listaMotorista = get();

    return listaMotorista.get(nome);
  }
}
