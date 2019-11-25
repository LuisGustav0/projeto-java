package com.unialfa.solid.lsp.is_lsp;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class GerarArquivo {

    private void executarArquivoLeitura(Arquivo arquivo) {
        ArquivoLer arquivoLer = (ArquivoLer) arquivo;
        arquivoLer.ler();
    }

    private void executarArquivoEscrita(Arquivo arquivo) {
        ArquivoEscrever arquivoEscrever = (ArquivoEscrever) arquivo;
        arquivoEscrever.escrever();
    }

    private void executarArquivo(Arquivo arquivo) {
        Optional.ofNullable(arquivo)
                .filter(Arquivo::isArquivoLer)
                .ifPresent(this::executarArquivoLeitura);

        Optional.ofNullable(arquivo)
                .filter(Arquivo::isArquivoEscrever)
                .ifPresent(this::executarArquivoEscrita);
    }

    public void gerarArquivos(List<Arquivo> listaArquivo) {
        listaArquivo.forEach(this::executarArquivo);
    }

    public static void main(String[] args) {
        ArquivoTxt arquivoTxt = new ArquivoTxt();
        ArquivoSomenteLeitura arquivoSomenteLeitura = new ArquivoSomenteLeitura();

        List<Arquivo> listaArquivo = Arrays.asList(arquivoTxt, arquivoSomenteLeitura);
        GerarArquivo gerarArquivo = new GerarArquivo();
        gerarArquivo.gerarArquivos(listaArquivo);
    }
}
