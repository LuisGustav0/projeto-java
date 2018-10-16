package com.atentatecnologia.modulos.mercado;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class MercadoPO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;
	
	private MercadoTO mercadoTO;

	public MercadoTO salvar() {
		
		return manager.merge(mercadoTO);
	}
	
	public MercadoTO buscarPorCodigo(Long codigo) {
		
		return manager.find(MercadoTO.class, codigo);
	}
	
	@SuppressWarnings("unchecked")
	public List<MercadoTO> buscarTodos() {
		
		return manager.createQuery("from MercadoTO").getResultList();
	}

	public MercadoTO getMercadoTO() {
		return mercadoTO;
	}

	public void setMercadoTO(MercadoTO mercadoTO) {
		this.mercadoTO = mercadoTO;
	}
}
