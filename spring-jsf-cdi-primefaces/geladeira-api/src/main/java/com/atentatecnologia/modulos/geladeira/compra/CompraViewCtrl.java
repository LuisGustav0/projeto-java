package com.atentatecnologia.modulos.geladeira.compra;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import com.atentatecnologia.modulos.geladeira.GeladeiraPO;
import com.atentatecnologia.modulos.geladeira.GeladeiraTO;
import com.atentatecnologia.modulos.geladeira.item.ItemGeladeiraTO;
import com.atentatecnologia.modulos.mercado.MercadoPO;
import com.atentatecnologia.modulos.mercado.MercadoTO;
import com.atentatecnologia.modulos.produto.ProdutoPO;
import com.atentatecnologia.modulos.produto.ProdutoTO;
import com.atentatecnologia.sistema.exception.NegocioException;
import com.atentatecnologia.sistema.jsf.FacesUtil;

@Named("compraViewCtrl")
@ViewScoped
public class CompraViewCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private GeladeiraPO geladeiraPO;
	@Inject
	private MercadoPO mercadoPO;
	@Inject
	private ProdutoPO produtoPO;
	@Inject
	private CompraCtrl compraCtrl;

	private List<MercadoTO> mercados;
	private List<ProdutoTO> produtos;
	private List<ProdutoTO> produtosCompra;
	private ItemGeladeiraTO itemGeladeiraTO;

	public void iniciarItemGeladeira() {

		GeladeiraTO geladeiraTO = geladeiraPO.getGeladeira();
		
		this.itemGeladeiraTO = new ItemGeladeiraTO();
		itemGeladeiraTO.setData(new Date());
		itemGeladeiraTO.setGeladeiraTO(geladeiraTO);
	}

	public void iniciarVariaveis() {

		mercados = mercadoPO.buscarTodos();
		produtos = produtoPO.buscarTodos();
		iniciarItemGeladeira();
	}
	
	public void onComprar() {
		
		try {
			compraCtrl.setItemGeladeiraTO(itemGeladeiraTO);
			compraCtrl.setProdutosCompra(produtosCompra);
			compraCtrl.comprar();
			
			RequestContext.getCurrentInstance().closeDialog(null);
		} catch (NegocioException ne) {
			
			FacesUtil.addErrorMessage(ne.getMessage());
		}
	}

	public List<MercadoTO> getMercados() {
		return mercados;
	}

	public List<ProdutoTO> getProdutos() {
		return produtos;
	}

	public List<ProdutoTO> getProdutosCompra() {
		return produtosCompra;
	}

	public void setProdutosCompra(List<ProdutoTO> produtosCompra) {
		this.produtosCompra = produtosCompra;
	}

	public ItemGeladeiraTO getItemGeladeiraTO() {
		return itemGeladeiraTO;
	}

	public void setItemGeladeiraTO(ItemGeladeiraTO itemGeladeiraTO) {
		this.itemGeladeiraTO = itemGeladeiraTO;
	}
}
