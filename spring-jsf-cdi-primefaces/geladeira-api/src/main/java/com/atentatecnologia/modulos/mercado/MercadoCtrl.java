package com.atentatecnologia.modulos.mercado;

import java.io.Serializable;

import javax.inject.Inject;

import com.atentatecnologia.sistema.exception.NegocioException;

public class MercadoCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private MercadoBO mercadoBO;

	private MercadoTO mercadoTO;

	public MercadoTO salvar() throws NegocioException {

		mercadoBO.setMercadoTO(mercadoTO);
		return mercadoBO.salvar();
	}

	public MercadoTO getMercadoTO() {
		return mercadoTO;
	}

	public void setMercadoTO(MercadoTO mercadoTO) {
		this.mercadoTO = mercadoTO;
	}
}
