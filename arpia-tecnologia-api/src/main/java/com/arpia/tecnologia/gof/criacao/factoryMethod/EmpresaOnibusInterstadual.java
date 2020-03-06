package com.arpia.tecnologia.gof.criacao.factoryMethod;

class EmpresaOnibusInterstadual extends Empresa {

    @Override
    Passagem emitirPassagem(PassagemOnibus passagemOnibus) {
        return new PassagemOnibusIntertadual(passagemOnibus);
    }
}
