package com.atentatecnologia.sistema.seguranca;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.atentatecnologia.sistema.usuario.UsuarioTO;

public class UsuarioSistema extends User {

	private static final long serialVersionUID = 1L;

	private UsuarioTO usuarioTO;

	public UsuarioSistema(UsuarioTO usuarioTO, Collection<? extends GrantedAuthority> authorities) {

		super(usuarioTO.getEmail(), usuarioTO.getSenha(), authorities);
		this.usuarioTO = usuarioTO;
	}

	public UsuarioTO getUsuarioTO() {
		return usuarioTO;
	}
}