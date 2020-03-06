package com.arpia.tecnologia.gof.criacao.abstractFactory;

abstract class EmpresaOnibus {

    abstract PassagemOnibusUrbana emitirPassagemOnibusUrbano(PassagemOnibus passagemOnibus);

    abstract PassagemOnibusIntertadual emitirPassagemOnibusInterstadual(PassagemOnibus passagemOnibus);
}
