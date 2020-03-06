package com.arpia.tecnologia.gof.criacao.abstractFactory;

class ConcretoEmpresaOnibus extends EmpresaOnibus {

    @Override
    PassagemOnibusUrbana emitirPassagemOnibusUrbano(PassagemOnibus passagemOnibus) {
        return new ConcretoPassagemOnibusUrbano(passagemOnibus);
    }

    @Override
    PassagemOnibusIntertadual emitirPassagemOnibusInterstadual(PassagemOnibus passagemOnibus) {
        return new ConcretoPassagemOnibusInterstadual(passagemOnibus);
    }
}
