package com.atentatecnologia.modulos.mercado;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.atentatecnologia.sistema.exception.NegocioException;
import com.atentatecnologia.sistema.jsf.FacesUtil;

@Named("mercadoViewCtrl")
@ViewScoped
public class MercadoViewCtrl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private MercadoCtrl mercadoCtrl;

	private MercadoTO mercadoTO;

	public MercadoViewCtrl() {

		mercadoTO = new MercadoTO();
	}

	public void salvar() {

		try {
			mercadoCtrl.setMercadoTO(mercadoTO);
			mercadoTO = mercadoCtrl.salvar();
			FacesUtil.addInfoMessage("Mercado salvo com sucesso!");
		} catch (NegocioException ne) {
			
			FacesUtil.addErrorMessage(ne.getMessage());
		}
	}

	public MercadoTO getMercadoTO() {
		return mercadoTO;
	}

	public void setMercadoTO(MercadoTO mercadoTO) {
		this.mercadoTO = mercadoTO;
	}
}
