package com.atentatecnologia.sistema.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.atentatecnologia.modulos.marca.MarcaTO;


public class TesteMarca {
	
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("AvaliacaoAtentaTecnologiaPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();
		trx.begin();

		MarcaTO marcaTO = manager.find(MarcaTO.class, 2L);
		
		System.out.println(marcaTO);

		trx.commit();
	}
}
