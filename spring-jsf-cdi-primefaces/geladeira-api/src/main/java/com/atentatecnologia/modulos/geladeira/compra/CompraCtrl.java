package com.atentatecnologia.modulos.geladeira.compra;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import com.atentatecnologia.modulos.geladeira.item.ItemGeladeiraTO;
import com.atentatecnologia.modulos.produto.ProdutoTO;
import com.atentatecnologia.sistema.exception.NegocioException;

public class CompraCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private CompraBO compraBO;
	
	private ItemGeladeiraTO itemGeladeiraTO;
	private List<ProdutoTO> produtosCompra;
	
	public void comprar() throws NegocioException {
		
		compraBO.setItemGeladeiraTO(itemGeladeiraTO);
		compraBO.setProdutosCompra(produtosCompra);
		compraBO.comprar();
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
