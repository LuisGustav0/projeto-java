package com.unialfa.solid.srp.is_srp.exemplo02.enums;

import com.unialfa.solid.srp.is_srp.exemplo02.interfaces.IRegraDeCalculo;
import com.unialfa.solid.srp.is_srp.exemplo02.service.DezOuVintePorcentoService;
import com.unialfa.solid.srp.is_srp.exemplo02.service.QuinzeOuVinteECincoPorCentoService;

public enum TipoCargoE {
    DESENVOLVEDOR(new DezOuVintePorcentoService()),
    DBA(new DezOuVintePorcentoService()),
    TESTER(new QuinzeOuVinteECincoPorCentoService());

    private IRegraDeCalculo regra;

    TipoCargoE(IRegraDeCalculo regra) {
        this.regra = regra;
    }

    public IRegraDeCalculo getRegra() {
        return regra;
    }
}
