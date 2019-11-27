package com.unialfa.solid.ocp.is_ocp.exemplo03.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
public class Produto implements Serializable {

    private BigDecimal valor;
}
