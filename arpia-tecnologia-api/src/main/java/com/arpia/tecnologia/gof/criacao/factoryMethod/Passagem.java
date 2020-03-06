package com.arpia.tecnologia.gof.criacao.factoryMethod;

abstract class Passagem {

    private PassagemOnibus passagemOnibus;

    PassagemOnibus getPassagemOnibus() {
        return passagemOnibus;
    }

    void setPassagemOnibus(PassagemOnibus passagemOnibus) {
        this.passagemOnibus = passagemOnibus;
    }

    abstract void exibirDetalhes();
}
