package com.atentatecnologia.modulos.geladeira;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.primefaces.context.RequestContext;

import com.atentatecnologia.modulos.geladeira.item.ItemGeladeiraBO;
import com.atentatecnologia.modulos.geladeira.item.ItemGeladeiraPO;
import com.atentatecnologia.modulos.geladeira.item.ItemGeladeiraTO;
import com.atentatecnologia.sistema.jsf.FacesUtil;

@Named("geladeiraViewCtrl")
@ViewScoped
public class GeladeiraViewCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private ItemGeladeiraPO itemGeladeiraPO;
	@Inject
	private ItemGeladeiraBO itemGeladeiraBO;

	private List<ItemGeladeiraTO> itensGeladeira;
	private ItemGeladeiraTO itemGeladeiraSelecionado;
	
	public void iniciarVariaveis() {
		
		pesquisar();
	}
	
	public void pesquisar() {
		
		itensGeladeira = itemGeladeiraPO.buscarTodos();
	}

	private Map<String, Object> getOptionsPadrao(String tamnahoDialog) {

		int width = tamnahoDialog.equals("lg") ? 800 : 644;
		int height = tamnahoDialog.equals("lg") ? 600 : 200;

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("width", width);
		options.put("height", height);
		options.put("resizable", false);
		options.put("contentWidth", "100%");
		options.put("contentHeight", "100%");
		options.put("headerElement", "customheader");

		return options;
	}

	private void onAbrirDialog(String nomeDialog, String tamnahoDialog) {

		String caminhoDialog = "/views/dialogos/" + nomeDialog;

		RequestContext.getCurrentInstance().openDialog(caminhoDialog, getOptionsPadrao(tamnahoDialog), null);
	}

	public void onAbrirComprar() {

		onAbrirDialog("cadastro-compra", "lg");
	}

	public void onAbrirCadastroMercado() {

		onAbrirDialog("cadastro-mercado", "md");
	}

	public void onAbrirCadastroMarca() {

		onAbrirDialog("cadastro-marca", "md");
	}

	public void onAbrirCadastroProduto() {

		onAbrirDialog("cadastro-produto", "lg");
	}

	public void onConsumirItemGeladeira() {

		try {
			itemGeladeiraBO.setItemGeladeiraTO(itemGeladeiraSelecionado);
			itemGeladeiraBO.consumirItemGeladeira();
			
			FacesUtil.addInfoMessage("Produto: " + itemGeladeiraSelecionado.getProduto() + " foi consumido!");
		} catch (Exception ex) {

			FacesUtil.addErrorMessage(ex.getMessage());
		}
	}

	public List<ItemGeladeiraTO> getItensGeladeira() {
		return itensGeladeira;
	}

	public void setItensGeladeira(List<ItemGeladeiraTO> itensGeladeira) {
		this.itensGeladeira = itensGeladeira;
	}

	public ItemGeladeiraTO getItemGeladeiraSelecionado() {
		return itemGeladeiraSelecionado;
	}

	public void setItemGeladeiraSelecionado(ItemGeladeiraTO itemGeladeiraSelecionado) {
		this.itemGeladeiraSelecionado = itemGeladeiraSelecionado;
	}
}
