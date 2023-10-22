package br.edu.infnet.appvenda;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvenda.model.domain.Moveis;
import br.edu.infnet.appvenda.model.service.ServicoMoveis;

@Component
public class CarregarMoveis implements ApplicationRunner{
	
	@Autowired
	private ServicoMoveis moveisServico;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("file/moveis.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");		
			
			Moveis moveis = new Moveis();
			
			moveis.setCodigo(Integer.valueOf(campos[0]));
			moveis.setDescricao(campos[1]);
			moveis.setPreco(Float.valueOf(campos[2]));
			moveis.setEstoque(Boolean.valueOf(campos[3]));
			moveis.setCor(campos[4]);
			moveis.setMaterial(campos[5]);
			
			moveisServico.incluir(moveis);
			
			linha = leitura.readLine();
		}
		
		for (Moveis moveis :  moveisServico.obterLista()) {
			System.out.println("Moveis: " + moveis);
		}
		
		
		leitura.close();
	}
}
