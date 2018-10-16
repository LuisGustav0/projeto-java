package com.atentatecnologia.modulos.marca;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.inject.Inject;

import com.atentatecnologia.sistema.util.UtilVariados;

@FacesConverter(forClass = MarcaTO.class)
public class MarcaConverter implements Converter {

	@Inject
	private MarcaPO marcaPO;

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		
		MarcaTO retorno = null;

		if (UtilVariados.isCampoPreenchido(value)) {
			
			Long codigo = new Long(value);
			retorno = marcaPO.buscarPorCodigo(codigo);
		}
		return retorno;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		
		if (value != null) {
		
			MarcaTO marcaTO = (MarcaTO) value;
			return marcaTO.getCodigo() == null ? null : marcaTO.getCodigo().toString();
		}
		return "";
	}
}
