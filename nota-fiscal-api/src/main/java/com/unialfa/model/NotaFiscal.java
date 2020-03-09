package com.unialfa.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.unialfa.help.JsonBigDecimalDeserializer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
public class NotaFiscal implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, length = 80)
    private String empresa;

    @JsonDeserialize(using = JsonBigDecimalDeserializer.class)
    @Column(name = "valor_bruto", nullable = false)
    private BigDecimal valorBruto;

    @JsonDeserialize(using = JsonBigDecimalDeserializer.class)
    @Column(nullable = false)
    private BigDecimal imposto;
}
