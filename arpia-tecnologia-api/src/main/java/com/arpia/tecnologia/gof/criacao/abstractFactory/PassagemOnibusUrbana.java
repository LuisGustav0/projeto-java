package com.arpia.tecnologia.gof.criacao.abstractFactory;

abstract class PassagemOnibusUrbana {
    private PassagemOnibus passagemOnibus;

    public PassagemOnibusUrbana(PassagemOnibus passagemOnibus) {
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
