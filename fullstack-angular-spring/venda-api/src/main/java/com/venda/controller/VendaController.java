package com.venda.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venda.model.Venda;
import com.venda.repository.VendaRepository;
import com.venda.service.VendaService;

@CrossOrigin("*")
@RestController
@RequestMapping("/venda")
public class VendaController {
	
	@Autowired
	private VendaRepository vendaRepository;
	
	@Autowired
	private VendaService vendaService;
	
	@GetMapping
	public List<Venda> listar() {
		return vendaRepository.findAll();
	}
	
	@PostMapping
	public Venda salvar(@RequestBody @Valid Venda venda) {
		return vendaService.salvar(venda);
	}
}
