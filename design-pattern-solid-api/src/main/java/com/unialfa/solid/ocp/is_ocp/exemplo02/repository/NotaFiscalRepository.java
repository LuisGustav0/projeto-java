package com.unialfa.solid.ocp.is_ocp.exemplo02.repository;

import com.unialfa.solid.ocp.is_ocp.exemplo02.interfaces.IBaseDeleteByIdRepository;
import com.unialfa.solid.ocp.is_ocp.exemplo02.interfaces.IBaseSaveRepository;
import com.unialfa.solid.ocp.is_ocp.exemplo02.model.NotaFiscal;
import org.springframework.stereotype.Repository;

@Repository
public class NotaFiscalRepository implements IBaseSaveRepository<NotaFiscal>,
                                             IBaseDeleteByIdRepository {

    @Override
    public void save(NotaFiscal notaFiscal) {
        System.out.println("Salvar nota fiscal no banco");
    }

    @Override
    public void deleteByID(Long id) {

    }
}
