package com.arpia.tecnologia.gof.criacao.abstractFactory;

import java.time.LocalDateTime;

class PassagemOnibus {
    private String origem;
    private String destino;
    private LocalDateTime dataHoraPartida;

    String getOrigem() {
        return origem;
    }

    void setOrigem(String origem) {
        this.origem = origem;
    }

    String getDestino() {
        return destino;
    }

    void setDestino(String destino) {
        this.destino = destino;
    }

    LocalDateTime getDataHoraPartida() {
        return dataHoraPartida;
    }

    void setDataHoraPartida(LocalDateTime dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }
}
