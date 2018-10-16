package com.atentatecnologia.modulos.produto;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.atentatecnologia.sistema.exception.NegocioException;

public class ProdutoPO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	private ProdutoTO produtoTO;
	
	public ProdutoTO salvar() throws NegocioException {
		return manager.merge(produtoTO);
	}

	@SuppressWarnings("unchecked")
	public List<ProdutoTO> buscarTodos() {
		
		return manager.createQuery("from ProdutoTO").getResultList();
	}
	
	public ProdutoTO getProdutoTO() {
		return produtoTO;
	}

	public void setProdutoTO(ProdutoTO produtoTO) {
		this.produtoTO = produtoTO;
	}
}
