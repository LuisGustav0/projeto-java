package com.atentatecnologia.modulos.geladeira.item;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class ItemGeladeiraPO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Inject
	private EntityManager manager;
	
	private ItemGeladeiraTO itemGeladeiraTO;
	
	public ItemGeladeiraTO salvar() {
	
		return manager.merge(itemGeladeiraTO);
	}

	@SuppressWarnings("unchecked")
	public List<ItemGeladeiraTO> buscarTodos() {
		
		StringBuilder sql = new StringBuilder();
		sql.append("from ItemGeladeiraTO ");
		sql.append("order by data desc, mercado_codigo");
		
		return manager.createQuery(sql.toString()).getResultList();
	}
	
	public ItemGeladeiraTO getItemGeladeiraTO() {
		return itemGeladeiraTO;
	}

	public void setItemGeladeiraTO(ItemGeladeiraTO itemGeladeiraTO) {
		this.itemGeladeiraTO = itemGeladeiraTO;
	}
}
