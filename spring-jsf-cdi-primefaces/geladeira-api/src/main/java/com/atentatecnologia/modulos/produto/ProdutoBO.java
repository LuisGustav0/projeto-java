package com.atentatecnologia.modulos.produto;

import java.io.Serializable;

import javax.inject.Inject;

import com.atentatecnologia.sistema.exception.NegocioException;
import com.atentatecnologia.sistema.jpa.Transactional;
import com.atentatecnologia.sistema.util.UtilVariados;

public class ProdutoBO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProdutoPO produtoPO;
	
	private ProdutoTO produtoTO;
	
	private void validarSalvar() throws NegocioException {

		if (UtilVariados.isCampoNaoPreenchido(produtoTO.getNome())) {

			throw new NegocioException("Campo preenchimento obrigatorio: Nome");
		}
		
		if (UtilVariados.isCampoNaoPreenchido(produtoTO.getMarcaTO())) {

			throw new NegocioException("Campo preenchimento obrigatorio: Marca");
		}
		
		if (UtilVariados.isCampoNaoPreenchido(produtoTO.getTipoProduto())) {

			throw new NegocioException("Campo preenchimento obrigatorio: Tipo de produto");
		}

		if (UtilVariados.isCampoNaoPreenchido(produtoTO.getValor())) {

			if(UtilVariados.isNumeroInvalido(produtoTO.getValor())) {
				
				throw new NegocioException("Valor deve ser maior que ZERO");
			}
			throw new NegocioException("Campo preenchimento obrigatorio: Valor");
		}
		
		if (UtilVariados.isCampoNaoPreenchido(produtoTO.getDataValidade())) {

			throw new NegocioException("Campo preenchimento obrigatorio: Data de validade");
		}
	}
	
	@Transactional
	public ProdutoTO salvar() throws NegocioException {
		
		validarSalvar();
		
		produtoPO.setProdutoTO(produtoTO);
		return produtoPO.salvar();
	}
	
	public ProdutoTO getProdutoTO() {
		return produtoTO;
	}

	public void setProdutoTO(ProdutoTO produtoTO) {
		this.produtoTO = produtoTO;
	}
}
