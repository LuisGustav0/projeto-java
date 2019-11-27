package com.unialfa.solid.ocp.not_ocp.exemplo03.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class Cliente implements Serializable {

    private LocalDate dataCadastro;
}
