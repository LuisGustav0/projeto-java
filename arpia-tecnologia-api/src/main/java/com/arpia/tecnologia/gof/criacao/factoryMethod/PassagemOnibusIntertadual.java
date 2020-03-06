package com.arpia.tecnologia.gof.criacao.factoryMethod;

import java.time.LocalDateTime;

class PassagemOnibusIntertadual extends Passagem {

    PassagemOnibusIntertadual(PassagemOnibus passagemOnibus) {
        this.setPassagemOnibus(passagemOnibus);
    }

    void exibirDetalhes() {
        String origem = this.getPassagemOnibus().getOrigem();
        String destino = this.getPassagemOnibus().getDestino();
        LocalDateTime dataHora = this.getPassagemOnibus().getDataHoraPartida();

        StringBuilder texto = new StringBuilder();
        texto.append("Passagem de ônibus interstadual: ").append(origem).append("\n");
        texto.append("para ").append(destino).append("\n");
        texto.append("Data/Hora: ").append(dataHora);

        System.out.println(texto);
    }
}
