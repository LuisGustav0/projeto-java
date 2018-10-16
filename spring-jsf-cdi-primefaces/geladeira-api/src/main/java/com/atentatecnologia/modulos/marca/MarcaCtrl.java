package com.atentatecnologia.modulos.marca;

import java.io.Serializable;

import javax.inject.Inject;

import com.atentatecnologia.sistema.exception.NegocioException;

public class MarcaCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private MarcaBO marcaBO;

	private MarcaTO marcaTO;

	public MarcaTO salvar() throws NegocioException {

		marcaBO.setMarcaTO(marcaTO);
		return marcaBO.salvar();
	}

	public MarcaTO getMarcaTO() {
		return marcaTO;
	}

	public void setMarcaTO(MarcaTO marcaTO) {
		this.marcaTO = marcaTO;
	}
}
