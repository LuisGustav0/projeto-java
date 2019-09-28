package com.arpia.tecnologia.rmview;

import com.arpia.tecnologia.rmview.painel.visao.Relatorio1;
import com.arpia.tecnologia.rmview.painel.visao.Relatorio2;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppRmView {
  private static final ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
  private static final ObjectMapper mapper = new ObjectMapper();

  private static String inline(String payload) {
    if (payload == null || payload.length() == 0)
      return "";

    StringReader stringReader = new StringReader(payload);
    JsonReader jsonReader = new JsonReader(stringReader);
    JsonParser jsonParser = new JsonParser();
    JsonElement jsonElement = jsonParser.parse(jsonReader);
    return jsonElement.toString();
  }

  public static String jsonFromStream(InputStream inputStream) {
    try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
      int length;
      byte[] buffer = new byte[1024];
      while ((length = inputStream.read(buffer)) != -1)
        outputStream.write(buffer, 0, length);
      return inline(outputStream.toString(StandardCharsets.UTF_8.toString()));
    } catch (IOException e) {
      return "";
    }
  }

  public static <T> T getMockObjectFromJsonFile(String fileName, Class<T> classReference) throws IOException {
    InputStream resourceAsStream = classLoader.getResourceAsStream(fileName);
    String json = jsonFromStream(resourceAsStream);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    return mapper.readValue(json, classReference);
  }

  public static <T> T getMockObjectFromJsonFile(String fileName, TypeReference<T> classReference) throws IOException {
    InputStream resourceAsStream = classLoader.getResourceAsStream(fileName);
    String json = jsonFromStream(resourceAsStream);
    mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    return mapper.readValue(json, classReference);
  }

  private static void addFieldRelatorio2(List<Relatorio2> listaRelatorio2) {
    Arrays.asList(Relatorio1.class.getDeclaredFields())
          .stream()
          .forEach(field -> {
            String name = field.getName();

            if ("data".equals(name) || "diaSemana".equals(name)) {
              return;
            }

            Relatorio2 relatorio2 = new Relatorio2();
            relatorio2.setMediaPorDiaDaSemana(name);

            listaRelatorio2.add(relatorio2);
          });
  }

  public static String getStringComPrimeiraLetraMaiuscula(String string) {
    return string.substring(0, 1).toUpperCase() + string.substring(1);
  }

  public static String getNomeDoMetodoGet(String nomeDoAtributo) {
    return "get" + getStringComPrimeiraLetraMaiuscula(nomeDoAtributo);
  }

  private Integer getDiaDaSemana(Relatorio2 relatorio2, Relatorio1 relatorio1) {
//    Integer valor = Arrays.asList(relatorio1.getClass().getDeclaredMethods())
//                          .stream()
//                          .filter(method -> {
//                            String nomeDoMetodoGet = getNomeDoMetodoGet(relatorio2.getMediaPorDiaDaSemana());
//
//                            return method.getName().equals(nomeDoMetodoGet);
//                          })
//                          .map(String::valueOf)
//                          .map(Integer::valueOf)
//                          .findFirst();

    return null;
  }

  private static void addValorPorField(Relatorio2 relatorio2, Relatorio1 relatorio1) {

  }

  private static void addValorField(List<Relatorio1> listaRelatorio1, Relatorio2 relatorio2) {
    listaRelatorio1.stream()
                   .forEach(relatorio1 -> addValorPorField(relatorio2, relatorio1));
  }

  public static void main(String[] args) {
//    List<Relatorio1> listaRelatorio1 = getMockObjectFromJsonFile("lista.json", new TypeReference<List<Relatorio1>>() {
//    });
//
//    System.out.println(listaRelatorio1);
//
//    List<Relatorio2> listaRelatorio2 = new ArrayList<>();
//
//    addFieldRelatorio2(listaRelatorio2);
//
//    listaRelatorio2.stream()
//                   .map(AppRmView::relatorio2ToRelatorio1);
//
//    System.out.println(listaRelatorio2);

    // 326132613261326132613261326132613261326132613261302
  }
}
