package com.atentatecnologia.sistema.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.atentatecnologia.modulos.mercado.MercadoTO;

public class TesteMercado {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("AvaliacaoAtentaTecnologiaPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();
		trx.begin();

		MercadoTO mercadoTO = new MercadoTO();
		mercadoTO.setNome("Goiabão");
		manager.persist(mercadoTO);

		trx.commit();
	}
}
