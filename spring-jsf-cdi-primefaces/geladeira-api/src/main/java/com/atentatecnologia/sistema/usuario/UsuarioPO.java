package com.atentatecnologia.sistema.usuario;

import java.io.Serializable;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

public class UsuarioPO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	private UsuarioTO usuarioTO;

	public UsuarioTO buscarPorCodigo(Long codigo) {

		return this.manager.find(UsuarioTO.class, codigo);
	}

	public UsuarioTO buscarPorEmail(String email) {

		UsuarioTO usuario = null;

		try {
			usuario = this.manager.createQuery("from UsuarioTO where lower(email) = :email", UsuarioTO.class)
					.setParameter("email", email.toLowerCase()).getSingleResult();
		} catch (NoResultException e) {
			// nenhum usuário encontrado com o e-mail informado
		}

		return usuario;
	}

	public UsuarioTO getUsuarioTO() {
		return usuarioTO;
	}

	public void setUsuarioTO(UsuarioTO usuarioTO) {
		this.usuarioTO = usuarioTO;
	}
}
