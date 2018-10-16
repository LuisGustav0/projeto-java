package com.atentatecnologia.modulos.produto;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.atentatecnologia.modulos.marca.MarcaPO;
import com.atentatecnologia.modulos.marca.MarcaTO;
import com.atentatecnologia.modulos.produto.enums.TipoProduto;
import com.atentatecnologia.sistema.exception.NegocioException;
import com.atentatecnologia.sistema.jsf.FacesUtil;

@Named("produtoViewCtrl")
@ViewScoped
public class ProdutoViewCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private ProdutoCtrl produtoCtrl;
	@Inject
	private MarcaPO marcaPO;

	private ProdutoTO produtoTO;
	private List<MarcaTO> marcas;

	public void iniciarVariaveis() {

		this.produtoTO = new ProdutoTO();
		this.marcas = marcaPO.buscarTodos();
	}

	public void salvar() {

		try {
			produtoCtrl.setProdutoTO(produtoTO);
			produtoTO = produtoCtrl.salvar();
			FacesUtil.addInfoMessage("Produto salvo com sucesso!");
		} catch (NegocioException ne) {

			FacesUtil.addErrorMessage(ne.getMessage());
		}
	}

	public List<MarcaTO> getMarcas() {
		return marcas;
	}

	public ProdutoTO getProdutoTO() {
		return produtoTO;
	}

	public void setProdutoTO(ProdutoTO produtoTO) {
		this.produtoTO = produtoTO;
	}

	public TipoProduto[] getTiposProduto() {
		return TipoProduto.values();
	}
}
