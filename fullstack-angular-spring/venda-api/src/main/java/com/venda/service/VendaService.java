package com.venda.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venda.model.Venda;
import com.venda.repository.ProdutoRepository;
import com.venda.repository.VendaRepository;

@Service
public class VendaService {

	@Autowired
	private VendaRepository vendaRepository;

	@Autowired
	private ProdutoRepository produtos;

	public Venda salvar(Venda venda) {
		venda.setData(LocalDateTime.now());
		
		venda.getItens().forEach(i -> {
			i.setVenda(venda);
			i.setProduto(produtos.findById(i.getProduto().getId()).get());
		});

		BigDecimal totalItens = venda.getItens().stream()
				.map(i -> i.getProduto().getValor().multiply(new BigDecimal(i.getQuantidade())))
				.reduce(BigDecimal.ZERO, BigDecimal::add);

		venda.setTotal(totalItens.add(venda.getFrete()));

		return vendaRepository.save(venda);
	}
}
