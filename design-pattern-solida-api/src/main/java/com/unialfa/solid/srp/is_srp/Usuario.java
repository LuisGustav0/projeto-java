package com.unialfa.solid.srp.is_srp;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Usuario implements Serializable {

    private int id;
    private String nome;
    private String email;

    public Usuario(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;

        EmailService emailService = new EmailService();
        emailService.validarEmail(email);
        emailService.enviarEmail(email, "Hello world...");
    }
}
