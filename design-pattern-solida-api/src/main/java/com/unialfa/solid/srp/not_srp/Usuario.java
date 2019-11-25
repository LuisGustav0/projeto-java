package com.unialfa.solid.srp.not_srp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class Usuario implements Serializable {

    private int id;
    private String nome;
    private String email;

    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    public void enviarEmail(String email, String mensagem) {
        System.out.println("E-Mail: " + email);
        System.out.println("Mensagem: " + mensagem);

        System.out.println("E-Mail enviado...!");
    }
}
