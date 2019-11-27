package com.unialfa.solid.ocp.is_ocp.exemplo01;

import java.util.Arrays;
import java.util.List;

public class GerarArquivo {

    public void gerarArquivos(List<Arquivo> listaArquivo) {
        listaArquivo.forEach(Arquivo::gerar);
    }

    public static void main(String[] args) {
        ArquivoWord arquivoWord = new ArquivoWord();
        ArquivoPDF arquivoPDF = new ArquivoPDF();

        List<Arquivo> listaArquivo = Arrays.asList(arquivoWord, arquivoPDF);
        GerarArquivo gerarArquivo = new GerarArquivo();
        gerarArquivo.gerarArquivos(listaArquivo);
    }
}
