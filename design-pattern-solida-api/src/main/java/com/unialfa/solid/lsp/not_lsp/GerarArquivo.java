package com.unialfa.solid.lsp.not_lsp;

import java.util.Arrays;
import java.util.List;

public class GerarArquivo {

    public void gerarArquivos(List<Arquivo> listaArquivo) {
        listaArquivo.forEach(arquivo -> {
            if(arquivo instanceof ArquivoSomenteLeitura) {
                arquivo.ler();
            } else {
                arquivo.ler();
                arquivo.escrever();
            }
        });
    }

    public static void main(String[] args) {
        ArquivoTxt arquivoTxt = new ArquivoTxt();
        ArquivoSomenteLeitura arquivoSomenteLeitura = new ArquivoSomenteLeitura();

        List<Arquivo> listaArquivo = Arrays.asList(arquivoTxt, arquivoSomenteLeitura);
        GerarArquivo gerarArquivo = new GerarArquivo();
        gerarArquivo.gerarArquivos(listaArquivo);
    }
}
