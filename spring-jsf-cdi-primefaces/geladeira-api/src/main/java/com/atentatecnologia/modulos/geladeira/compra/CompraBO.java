package com.atentatecnologia.modulos.geladeira.compra;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import com.atentatecnologia.modulos.geladeira.item.ItemGeladeiraBO;
import com.atentatecnologia.modulos.geladeira.item.ItemGeladeiraTO;
import com.atentatecnologia.modulos.produto.ProdutoTO;
import com.atentatecnologia.sistema.exception.NegocioException;
import com.atentatecnologia.sistema.util.UtilVariados;

public class CompraBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private ItemGeladeiraBO itemGeladeiraBO;
	
	private ItemGeladeiraTO itemGeladeiraTO;
	private List<ProdutoTO> produtosCompra;

	private void validarComprar() throws NegocioException {
		
		if(UtilVariados.isCampoNaoPreenchido(itemGeladeiraTO.getMercadoTO())) {
			
			throw new NegocioException("Campo preenchimento obrigatorio: Mercado");
		}
		
		if(UtilVariados.isListaVazia(produtosCompra)) {
			
			throw new NegocioException("Pra comprar selecione pelo menos um produto!");
		}
	}
	
	private void salvarItensGeladeira() {
		
		for(ProdutoTO produtoTO: produtosCompra) {
			
			itemGeladeiraTO.setProdutoTO(produtoTO);
			itemGeladeiraBO.setItemGeladeiraTO(itemGeladeiraTO);
			itemGeladeiraBO.salvar();
		}
	}

	public void comprar() throws NegocioException {

		validarComprar();
		salvarItensGeladeira();
	}

	public ItemGeladeiraTO getItemGeladeiraTO() {
		return itemGeladeiraTO;
	}

	public void setItemGeladeiraTO(ItemGeladeiraTO itemGeladeiraTO) {
		this.itemGeladeiraTO = itemGeladeiraTO;
	}

	public List<ProdutoTO> getProdutosCompra() {
		return produtosCompra;
	}

	public void setProdutosCompra(List<ProdutoTO> produtosCompra) {
		this.produtosCompra = produtosCompra;
	}
}
