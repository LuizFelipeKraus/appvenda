package br.edu.infnet.appvenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.infnet.appvenda.model.service.ServicoMoveis;
import br.edu.infnet.appvenda.model.service.ServicoEletrodomestico;
import br.edu.infnet.appvenda.model.service.ServicoInformacao;
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
	@Autowired
	private ServicoInformacao informacaoService;

	@GetMapping(value = "/")
	public String showHome(Model model) {
		
		model.addAttribute("informacoes", informacaoService.obterLista());
		model.addAttribute("qtdeVendedor", vendedorService.obterQtde());
		model.addAttribute("qtdeProduto", produtoService.obterQtde());
		model.addAttribute("qtdeMoveis", moveisService.obterQtde());
		model.addAttribute("qtdeEletronico", eletrodomesticoService.obterQtde());

		return "home";
	}
	
	@GetMapping(value = "/produto/lista")
	public String obterListaProduto(Model model) {
		
		model.addAttribute("titulo", "Produtos:");
		model.addAttribute("listagem", produtoService.obterLista());

		return showHome(model);
	}

	@GetMapping(value = "/moveis/lista")
	public String obterListaAlimenticio(Model model) {
		
		model.addAttribute("titulo", "Produtos moveis:");
		model.addAttribute("listagem", moveisService.obterLista());

		return showHome(model);
	}

	@GetMapping(value = "/eletrodomestico/lista")
	public String obterListaEletronico(Model model) {
		
		model.addAttribute("titulo", "Produtos Eletrodomestico:");
		model.addAttribute("listagem", eletrodomesticoService.obterLista());

		return showHome(model);
	}
}