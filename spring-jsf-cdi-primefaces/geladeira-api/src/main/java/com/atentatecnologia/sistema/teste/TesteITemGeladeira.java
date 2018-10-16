package com.atentatecnologia.sistema.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.atentatecnologia.modulos.geladeira.item.ItemGeladeiraTO;

public class TesteITemGeladeira {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("AvaliacaoAtentaTecnologiaPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();
		trx.begin();

		
		ItemGeladeiraTO itemGeladeiraTO = manager.find(ItemGeladeiraTO.class, 1L);
		
		itemGeladeiraTO.setConsumido(true);
		manager.merge(itemGeladeiraTO);
		
			
		trx.commit();
	}
}
