package com.atentatecnologia.sistema.teste;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.atentatecnologia.modulos.marca.MarcaTO;
import com.atentatecnologia.modulos.produto.ProdutoTO;
import com.atentatecnologia.modulos.produto.enums.TipoProduto;

public class TesteProduto {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("AvaliacaoAtentaTecnologiaPU");
		EntityManager manager = factory.createEntityManager();

		EntityTransaction trx = manager.getTransaction();
		trx.begin();

		MarcaTO marcaTO = new MarcaTO();
		marcaTO.setNome("Marca 1");
		marcaTO = manager.merge(marcaTO);
		
		ProdutoTO produtoTO = new ProdutoTO();
		produtoTO.setNome("Teste produto");
		produtoTO.setMarcaTO(marcaTO);
		produtoTO.setValor(12);
		produtoTO.setTipoProduto(TipoProduto.OUTROS);
		produtoTO.setDataValidade(new Date());
		manager.persist(produtoTO);

		trx.commit();
	}
}
