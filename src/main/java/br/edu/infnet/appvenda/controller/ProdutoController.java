package br.edu.infnet.appvenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appvenda.model.service.ServicoProduto;

public class ProdutoController {
	@Autowired
	private AppController appController;
	
	@Autowired
	private ServicoProduto produtoService;


	@GetMapping(value = "/produto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		produtoService.excluir(id);
		
		return "redirect:/produto/lista";
	}
	
	@GetMapping(value = "/produto/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("rota", "produto");
		model.addAttribute("titulo", "produtos:");
		model.addAttribute("listagem", produtoService.obterLista());

		return appController.showHome(model);
	}
}
