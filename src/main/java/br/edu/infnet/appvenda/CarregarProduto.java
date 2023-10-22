package br.edu.infnet.appvenda;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import br.edu.infnet.appvenda.model.domain.Eletrodomestico;
import br.edu.infnet.appvenda.model.domain.Moveis;
import br.edu.infnet.appvenda.model.domain.Produto;
import br.edu.infnet.appvenda.model.service.ServicoProduto;

public class CarregarProduto implements ApplicationRunner{
	@Autowired
	private ServicoProduto produtoServico;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("file/produto.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");		
			
			switch (campos[7]) {
			case "E": {
				Eletrodomestico eletronico = new Eletrodomestico();
				
				eletronico.setCodigo(Integer.valueOf(campos[0]));
				eletronico.setDescricao(campos[1]);
				eletronico.setPreco(Float.valueOf(campos[2]));
				eletronico.setEstoque(Boolean.valueOf(campos[3]));
				eletronico.setGarantia(Integer.valueOf(campos[4]));
				eletronico.setMarcar(campos[5]);
				eletronico.setVoltagem(Integer.valueOf(campos[6]));
				
				produtoServico.incluir(eletronico);
				
				break;
			}
			case "M":
				Moveis moveis = new Moveis();
				
				moveis.setCodigo(Integer.valueOf(campos[0]));
				moveis.setDescricao(campos[1]);
				moveis.setPreco(Float.valueOf(campos[2]));
				moveis.setEstoque(Boolean.valueOf(campos[3]));
				moveis.setCor(campos[4]);
				moveis.setMaterial(campos[5]);
				
				produtoServico.incluir(moveis);
				break;
			}
			
			
			linha = leitura.readLine();
		}
		
		for (Produto produto :  produtoServico.obterLista()) {
			System.out.println("Produto: " + produto);
		}
		
		
		leitura.close();
	}
}
