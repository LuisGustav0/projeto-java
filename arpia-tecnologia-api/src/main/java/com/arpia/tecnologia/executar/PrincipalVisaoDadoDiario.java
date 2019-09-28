package com.arpia.tecnologia.executar;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrincipalVisaoDadoDiario {

  private static String lerListaJson() {
    try {
      URL url = PrincipalVisaoDadoDiario.class.getResource("/lista-json/lista.json");
      Path resPath = Paths.get(url.toURI());
      return new String(Files.readAllBytes(resPath), "UTF8");
    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return null;
  }

  public static void main(String[] args) {
    String input = lerListaJson();
  }
}
