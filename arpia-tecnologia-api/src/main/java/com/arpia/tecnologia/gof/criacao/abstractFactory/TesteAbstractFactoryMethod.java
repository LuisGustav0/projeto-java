package com.arpia.tecnologia.gof.criacao.abstractFactory;

import java.time.LocalDateTime;

public class TesteAbstractFactoryMethod {

    public static void main(String[] args) {
        PassagemOnibus passagemOnibus = new PassagemOnibus();
        passagemOnibus.setOrigem("Goiânia");
        passagemOnibus.setDestino("Uberlândia");
        passagemOnibus.setDataHoraPartida(LocalDateTime.now());

        EmpresaOnibus empresaOnibus = new ConcretoEmpresaOnibus();

        PassagemOnibusUrbana passagemOnibusUrbana = empresaOnibus.emitirPassagemOnibusUrbano(passagemOnibus);
        passagemOnibusUrbana.exibirDetalhes();

        PassagemOnibusIntertadual passagemOnibusIntertadual = empresaOnibus.emitirPassagemOnibusInterstadual(passagemOnibus);
        passagemOnibusIntertadual.exibirDetalhes();
    }
}
