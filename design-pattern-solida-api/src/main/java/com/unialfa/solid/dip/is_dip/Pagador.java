package com.unialfa.solid.dip.is_dip;

import java.math.BigDecimal;

public interface Pagador {

    void setPagavel(Pagavel pagavel);

    String getNome();
    BigDecimal getSalario();
}
