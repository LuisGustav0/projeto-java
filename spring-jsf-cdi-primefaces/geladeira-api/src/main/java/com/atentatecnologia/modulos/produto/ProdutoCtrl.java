package com.atentatecnologia.modulos.produto;

import java.io.Serializable;

import javax.inject.Inject;

import com.atentatecnologia.sistema.exception.NegocioException;

public class ProdutoCtrl implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProdutoBO produtoBO;
	
	private ProdutoTO produtoTO;

	public ProdutoTO salvar() throws NegocioException {
		
		produtoBO.setProdutoTO(produtoTO);
		return produtoBO.salvar();
	}

	public ProdutoTO getProdutoTO() {
		return produtoTO;
	}

	public void setProdutoTO(ProdutoTO produtoTO) {
		this.produtoTO = produtoTO;
	}
}
