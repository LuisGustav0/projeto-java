package com.unialfa.solid.ocp.is_ocp.exemplo02.repository;

import com.unialfa.solid.ocp.is_ocp.exemplo02.interfaces.IBaseSaveRepository;
import com.unialfa.solid.ocp.is_ocp.exemplo02.model.Produto;

public class ProdutoRepository implements IBaseSaveRepository<Produto> {

    @Override
    public void save(Produto produto) {
        System.out.println("Salvar produto no banco");
    }
}
