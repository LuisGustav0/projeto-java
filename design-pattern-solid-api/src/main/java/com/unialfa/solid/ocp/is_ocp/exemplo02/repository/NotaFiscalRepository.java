package com.unialfa.solid.ocp.is_ocp.exemplo02.repository;

import com.unialfa.solid.ocp.is_ocp.exemplo02.interfaces.INotaFiscalSaveRepository;
import com.unialfa.solid.ocp.is_ocp.exemplo02.model.NotaFiscal;
import org.springframework.stereotype.Repository;

@Repository
public class NotaFiscalRepository implements INotaFiscalSaveRepository {

    @Override
    public void save(NotaFiscal notaFiscal) {
        System.out.println("Salvar nota fiscal no banco");
    }
}
