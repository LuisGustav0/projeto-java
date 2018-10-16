package com.atentatecnologia.modulos.mercado;

import java.io.Serializable;

import javax.inject.Inject;

import com.atentatecnologia.sistema.exception.NegocioException;
import com.atentatecnologia.sistema.jpa.Transactional;
import com.atentatecnologia.sistema.util.UtilVariados;

public class MercadoBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private MercadoPO mercadoPO;

	private MercadoTO mercadoTO;

	private void validarSalvar() throws NegocioException {

		if (UtilVariados.isCampoNaoPreenchido(mercadoTO.getNome())) {

			throw new NegocioException("Campo preenchimento obrigatorio: Nome");
		}
	}

	@Transactional
	public MercadoTO salvar() throws NegocioException {

		validarSalvar();

		mercadoPO.setMercadoTO(mercadoTO);
		return mercadoPO.salvar();
	}

	public MercadoTO getMercadoTO() {
		return mercadoTO;
	}

	public void setMercadoTO(MercadoTO mercadoTO) {
		this.mercadoTO = mercadoTO;
	}
}