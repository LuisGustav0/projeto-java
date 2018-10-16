package com.atentatecnologia.modulos.marca;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

public class MarcaPO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	private MarcaTO marcaTO;

	public MarcaTO salvar() {
		return manager.merge(marcaTO);
	}

	@SuppressWarnings("unchecked")
	public List<MarcaTO> buscarTodos() {
		return manager.createQuery("from MarcaTO").getResultList();
	}

	public MarcaTO buscarPorCodigo(Long codigo) {
		return manager.find(MarcaTO.class, codigo);
	}
	
	public MarcaTO getMarcaTO() {
		return marcaTO;
	}

	public void setMarcaTO(MarcaTO marcaTO) {
		this.marcaTO = marcaTO;
	}
}
