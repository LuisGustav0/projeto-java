package com.arpia.tecnologia.gof.criacao.factoryMethod;

class EmpresaOnibusUrbano extends Empresa {

    @Override
    Passagem emitirPassagem(PassagemOnibus passagemOnibus) {
        return new PassagemOnibusUrbano(passagemOnibus);
    }
}
