package br.edu.infnet.appvenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appvenda.model.service.ServicoMoveis;
import br.edu.infnet.appvenda.model.service.ServicoEletrodomestico;
import br.edu.infnet.appvenda.model.service.ServicoProduto;
import br.edu.infnet.appvenda.model.service.ServicoVendedor;

@Controller
public class AppController {
	
	@Autowired
	private ServicoVendedor vendedorService;
	@Autowired
	private ServicoProduto produtoService;
	@Autowired
	private ServicoMoveis moveisService;
	@Autowired
	private ServicoEletrodomestico eletrodomesticoService;

	@GetMapping(value = "/")
	public String showHome(Model model) {
		
		model.addAttribute("qtdeVendedor", vendedorService.obterQtde());
		model.addAttribute("qtdeProduto", produtoService.obterQtde());
		model.addAttribute("qtdeAlimenticio", moveisService.obterQtde());
		model.addAttribute("qtdeEletronico", eletrodomesticoService.obterQtde());

		return "home";
	}
	
	@GetMapping(value = "/produto/lista")
	public String obterListaProduto(Model model) {
		
		model.addAttribute("titulo", "Produtos:");
		model.addAttribute("listagem", produtoService.obterLista());

		return showHome(model);
	}

	@GetMapping(value = "/alimenticio/lista")
	public String obterListaAlimenticio(Model model) {
		
		model.addAttribute("titulo", "Produtos Alimentícios:");
		model.addAttribute("listagem", moveisService.obterLista());

		return showHome(model);
	}

	@GetMapping(value = "/eletronico/lista")
	public String obterListaEletronico(Model model) {
		
		model.addAttribute("titulo", "Produtos Eletrônicos:");
		model.addAttribute("listagem", eletrodomesticoService.obterLista());

		return showHome(model);
	}
}