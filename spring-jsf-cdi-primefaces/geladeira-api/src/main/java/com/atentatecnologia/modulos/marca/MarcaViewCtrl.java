package com.atentatecnologia.modulos.marca;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.atentatecnologia.sistema.exception.NegocioException;
import com.atentatecnologia.sistema.jsf.FacesUtil;

@Named("marcaViewCtrl")
@ViewScoped
public class MarcaViewCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private MarcaCtrl marcaCtrl;

	private MarcaTO marcaTO;

	public MarcaViewCtrl() {

		marcaTO = new MarcaTO();
	}

	public void salvar() {

		try {
			marcaCtrl.setMarcaTO(marcaTO);
			marcaTO = marcaCtrl.salvar();
			FacesUtil.addInfoMessage("Marca salvo com sucesso!");
		} catch (NegocioException ne) {

			FacesUtil.addErrorMessage(ne.getMessage());
		}
	}

	public MarcaTO getMarcaTO() {
		return marcaTO;
	}

	public void setMarcaTO(MarcaTO marcaTO) {
		this.marcaTO = marcaTO;
	}
}
