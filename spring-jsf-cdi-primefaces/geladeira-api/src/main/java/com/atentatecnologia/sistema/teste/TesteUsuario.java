package com.atentatecnologia.sistema.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.atentatecnologia.sistema.usuario.UsuarioTO;

public class TesteUsuario {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("AvaliacaoAtentaTecnologiaPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();
		trx.begin();

		UsuarioTO usuarioTO = new UsuarioTO();
		usuarioTO.setEmail("luis.gustav0@live.com");
		usuarioTO.setNome("Luis Gustavo S. G. de Oliveira");
		usuarioTO.setSenha("123");
		manager.persist(usuarioTO);

		trx.commit();
	}
}
