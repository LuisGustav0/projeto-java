package com.atentatecnologia.sistema.seguranca;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.atentatecnologia.sistema.cdi.CDIServiceLocator;
import com.atentatecnologia.sistema.usuario.UsuarioPO;
import com.atentatecnologia.sistema.usuario.UsuarioTO;

public class AppUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		UsuarioPO usuarioPO = CDIServiceLocator.getBean(UsuarioPO.class);
		UsuarioTO usuarioTO = usuarioPO.buscarPorEmail(email);

		UsuarioSistema user = null;

		if (usuarioTO != null) {

			user = new UsuarioSistema(usuarioTO, getGrupos(usuarioTO));
		} else {

			throw new UsernameNotFoundException("Usuário não encontrado.");
		}

		return user;
	}

	private Collection<? extends GrantedAuthority> getGrupos(UsuarioTO usuarioTO) {

		List<SimpleGrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_ADMINISTRADOR"));
		return authorities;
	}
}