package com.unialfa.solid.ocp.is_ocp.exemplo02.services;

import com.unialfa.solid.ocp.is_ocp.exemplo02.interfaces.INotaFiscalEnviarEmailService;
import com.unialfa.solid.ocp.is_ocp.exemplo02.model.NotaFiscal;
import org.springframework.stereotype.Service;

@Service
public class EnviadorEmailService implements INotaFiscalEnviarEmailService {

    @Override
    public void enviar(NotaFiscal notaFiscal) {
        System.out.println("Enviar email da nota fiscal: " + notaFiscal.getId());
    }
}
