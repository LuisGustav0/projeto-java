package com.atentatecnologia.modulos.marca;

import java.io.Serializable;

import javax.inject.Inject;

import com.atentatecnologia.sistema.exception.NegocioException;
import com.atentatecnologia.sistema.jpa.Transactional;
import com.atentatecnologia.sistema.util.UtilVariados;

public class MarcaBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private MarcaPO marcaPO;

	private MarcaTO marcaTO;

	private void validarSalvar() throws NegocioException {

		if (UtilVariados.isCampoNaoPreenchido(marcaTO.getNome())) {

			throw new NegocioException("Campo preenchimento obrigatorio: Nome");
		}
	}

	@Transactional
	public MarcaTO salvar() throws NegocioException {

		validarSalvar();

		marcaPO.setMarcaTO(marcaTO);
		return marcaPO.salvar();
	}

	public MarcaTO getMarcaTO() {
		return marcaTO;
	}

	public void setMarcaTO(MarcaTO marcaTO) {
		this.marcaTO = marcaTO;
	}
}