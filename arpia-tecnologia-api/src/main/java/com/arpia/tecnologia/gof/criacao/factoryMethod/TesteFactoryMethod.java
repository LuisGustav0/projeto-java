package com.arpia.tecnologia.gof.criacao.factoryMethod;

import java.time.LocalDateTime;

public class TesteFactoryMethod {

    public static void main(String[] args) {
        PassagemOnibus passagemOnibus = new PassagemOnibus();
        passagemOnibus.setOrigem("Goiânia");
        passagemOnibus.setDestino("Uberlândia");
        passagemOnibus.setDataHoraPartida(LocalDateTime.now());

        Empresa empresaOnibusUrbano = new EmpresaOnibusUrbano();
        Passagem passagemOnibusUrbano = empresaOnibusUrbano.emitirPassagem(passagemOnibus);
        passagemOnibusUrbano.exibirDetalhes();

        Empresa empresaOnibusInterstadual = new EmpresaOnibusInterstadual();
        Passagem passagemOnibusInterstadual = empresaOnibusInterstadual.emitirPassagem(passagemOnibus);
        passagemOnibusInterstadual.exibirDetalhes();
    }
}
