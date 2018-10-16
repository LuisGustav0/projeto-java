package com.atentatecnologia.sistema.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.atentatecnologia.modulos.geladeira.GeladeiraTO;

public class TesteGeladeira {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("AvaliacaoAtentaTecnologiaPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();
		trx.begin();

		GeladeiraTO geladeiraTO = manager.find(GeladeiraTO.class, 1L);
		
		System.out.println(geladeiraTO);
			
		trx.commit();
	}
}
