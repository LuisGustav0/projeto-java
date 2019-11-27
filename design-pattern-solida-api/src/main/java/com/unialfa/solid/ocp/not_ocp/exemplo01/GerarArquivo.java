package com.unialfa.solid.ocp.not_ocp.exemplo01;

import java.util.Arrays;
import java.util.List;

public class GerarArquivo {

    public void gerarArquivos(List<Arquivo> listaArquivo) {
        listaArquivo.forEach(arquivo -> {
            if(arquivo instanceof ArquivoWord) {
                ((ArquivoWord) arquivo).gerarDocx();
            } else {
                ((ArquivoPDF) arquivo).gerarPDF();
            }
        });
    }

    public static void main(String[] args) {
        ArquivoWord arquivoWord = new ArquivoWord();
        ArquivoPDF arquivoPDF = new ArquivoPDF();

        List<Arquivo> listaArquivo = Arrays.asList(arquivoWord, arquivoPDF);
        GerarArquivo gerarArquivo = new GerarArquivo();
        gerarArquivo.gerarArquivos(listaArquivo);
    }
}
