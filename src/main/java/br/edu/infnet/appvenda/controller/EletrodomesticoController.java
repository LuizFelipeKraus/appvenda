package br.edu.infnet.appvenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.appvenda.model.service.ServicoEletrodomestico;

public class EletrodomesticoController {
	@Autowired
	private AppController appController;
	
	@Autowired
	private ServicoEletrodomestico eletrodomesticoService;


	@GetMapping(value = "/eletrodomestico/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		
		eletrodomesticoService.excluir(id);
		
		return "redirect:/eletrodomestico/lista";
	}
	
	@GetMapping(value = "/eletrodomestico/lista")
	public String obterLista(Model model) {
		
		model.addAttribute("rota", "eletrodomestico");
		model.addAttribute("titulo", "eletrodomesticos:");
		model.addAttribute("listagem", eletrodomesticoService.obterLista());

		return appController.showHome(model);
	}
}
