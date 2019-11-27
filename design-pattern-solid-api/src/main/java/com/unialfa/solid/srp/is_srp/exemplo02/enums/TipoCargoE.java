package com.unialfa.solid.srp.is_srp.exemplo02.enums;

import com.unialfa.solid.srp.is_srp.exemplo02.interfaces.IRegraCalculo;
import com.unialfa.solid.srp.is_srp.exemplo02.service.DezOuVintePorcentoService;
import com.unialfa.solid.srp.is_srp.exemplo02.service.QuinzeOuVinteECincoPorCentoService;

public enum TipoCargoE {
    DESENVOLVEDOR(new DezOuVintePorcentoService()),
    DBA(new DezOuVintePorcentoService()),
    TESTER(new QuinzeOuVinteECincoPorCentoService());

    private IRegraCalculo regra;

    TipoCargoE(IRegraCalculo regra) {
        this.regra = regra;
    }

    public IRegraCalculo getRegra() {
        return regra;
    }
}
