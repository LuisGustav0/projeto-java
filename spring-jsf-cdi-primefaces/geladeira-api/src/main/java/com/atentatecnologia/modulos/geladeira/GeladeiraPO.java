package com.atentatecnologia.modulos.geladeira;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.atentatecnologia.sistema.exception.NegocioException;
import com.atentatecnologia.sistema.jpa.Transactional;

public class GeladeiraPO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	private GeladeiraTO geladeiraTO;

	@Transactional
	public GeladeiraTO getGeladeira() {

		this.geladeiraTO = manager.find(GeladeiraTO.class, 1L);
		try {
			if (this.geladeiraTO == null) {

				this.geladeiraTO = new GeladeiraTO();
				this.geladeiraTO.setCodigo(1L);
				this.geladeiraTO = salvar();
			}
		} catch (Exception e) {

		}
		return geladeiraTO;
	}

	public GeladeiraTO salvar() throws NegocioException {

		return manager.merge(geladeiraTO);
	}

	public GeladeiraTO getGeladeiraTO() {
		return geladeiraTO;
	}

	public void setGeladeiraTO(GeladeiraTO geladeiraTO) {
		this.geladeiraTO = geladeiraTO;
	}
}
