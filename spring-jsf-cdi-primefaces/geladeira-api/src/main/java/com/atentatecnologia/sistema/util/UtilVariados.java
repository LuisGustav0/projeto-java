package com.atentatecnologia.sistema.util;

import java.util.List;

public class UtilVariados {

	public static boolean isCampoPreenchido(Object valor) {

		return valor != null && !"".equals(valor.toString().trim()) && !valor.toString().trim().equals("NaN");
	}

	public static boolean isCampoNaoPreenchido(Object valor) {

		return !isCampoPreenchido(valor);
	}

	public static String somenteNumeros(String valor) {
		
		if(isCampoPreenchido(valor)) {
			valor = valor.replaceAll("[^0-9]", "");
		}
		return valor;
	}
	
	public static Boolean isNumeroValido(Number numero){
		if(numero instanceof Double)
			if(Double.isNaN(numero.doubleValue()))
					return false;
			
		return numero != null ? (numero.floatValue() > 0 ? true : false) : false;
	}
	
	public static boolean isNumeroInvalido(Number numero) {
		
		return !isNumeroInvalido(numero);
	}

	@SuppressWarnings("rawtypes")
	public static boolean isListaVazia(List lista) {
		
		return lista != null ? (lista.isEmpty() ? true : false) : false;
	}
}
