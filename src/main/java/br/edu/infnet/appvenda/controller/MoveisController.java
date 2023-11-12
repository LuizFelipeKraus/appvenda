package br.edu.infnet.appvenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appvenda.model.service.ServicoMoveis;

public class MoveisController {
	@Autowired
	private AppController appController;
	
	@Autowired
	private ServicoMoveis moveisService;


	@GetMapping(value = "/moveis/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		moveisService.excluir(id);
		
		return "redirect:/moveis/lista";
	}
	
	@GetMapping(value = "/moveis/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("rota", "movei");
		model.addAttribute("titulo", "moveis:");
		model.addAttribute("listagem", moveisService.obterLista());

		return appController.showHome(model);
	}
}
