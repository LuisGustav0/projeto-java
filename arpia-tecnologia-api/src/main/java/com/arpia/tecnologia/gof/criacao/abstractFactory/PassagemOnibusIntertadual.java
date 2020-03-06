package com.arpia.tecnologia.gof.criacao.abstractFactory;

abstract class PassagemOnibusIntertadual {

    private PassagemOnibus passagemOnibus;

    PassagemOnibusIntertadual(PassagemOnibus passagemOnibus) {
        this.passagemOnibus = passagemOnibus;
    }

    public PassagemOnibus getPassagemOnibus() {
        return this.passagemOnibus;
    }

    public void setPassagemOnibus(PassagemOnibus passagemOnibus) {
        this.passagemOnibus = passagemOnibus;
    }

    abstract void exibirDetalhes();
}
