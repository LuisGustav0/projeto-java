package com.atentatecnologia.modulos.geladeira.item;

import java.io.Serializable;

import javax.inject.Inject;

import com.atentatecnologia.sistema.jpa.Transactional;

public class ItemGeladeiraBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private ItemGeladeiraPO itemGeladeiraPO;
	
	private ItemGeladeiraTO itemGeladeiraTO;

	@Transactional
	public ItemGeladeiraTO salvar() {

		itemGeladeiraPO.setItemGeladeiraTO(itemGeladeiraTO);
		return itemGeladeiraPO.salvar();
	}
	
	@Transactional
	public void consumirItemGeladeira() {
		
		this.itemGeladeiraTO.setConsumido(true);
		itemGeladeiraPO.setItemGeladeiraTO(itemGeladeiraTO);
		itemGeladeiraPO.salvar();
	}

	public ItemGeladeiraTO getItemGeladeiraTO() {
		return itemGeladeiraTO;
	}

	public void setItemGeladeiraTO(ItemGeladeiraTO itemGeladeiraTO) {
		this.itemGeladeiraTO = itemGeladeiraTO;
	}	
}
