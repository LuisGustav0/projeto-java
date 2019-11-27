package com.unialfa.solid.srp.is_srp.exemplo01;

public class EmailService {

    public boolean validarEmail(String email) {
        return email.contains("@");
    }

    public void enviarEmail(String email, String mensagem) {
        System.out.println("E-Mail: " + email);
        System.out.println("Mensagem: " + mensagem);

        System.out.println("E-Mail enviado...!");
    }
}
