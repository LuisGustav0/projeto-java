package com.atentatecnologia.modulos.mercado;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.atentatecnologia.sistema.util.UtilVariados;

@FacesConverter(forClass = MercadoTO.class)
public class MercadoConverter implements Converter {

	@Inject
	private MercadoPO mercadoPO;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		MercadoTO retorno = null;

		if (UtilVariados.isCampoPreenchido(value)) {
			
			Long codigo = new Long(value);
			retorno = mercadoPO.buscarPorCodigo(codigo);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if (value != null) {
		
			MercadoTO mercadoTO = (MercadoTO) value;
			return mercadoTO.getCodigo() == null ? null : mercadoTO.getCodigo().toString();
		}
		return "";
	}
}
