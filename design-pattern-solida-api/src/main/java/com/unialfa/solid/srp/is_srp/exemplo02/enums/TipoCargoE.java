package com.unialfa.solid.srp.is_srp.exemplo02;

public enum TipoCargoE {
    DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new DezOuVintePorcento()),
    TESTER(new QuinzeOuVinteECincoPorCento());

    private IRegraDeCalculo regra;

    TipoCargoE(IRegraDeCalculo regra) {
        this.regra = regra;
    }

    public IRegraDeCalculo getRegra() {
        return regra;
    }
}
