package br.edu.infnet.appvenda;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvenda.model.domain.Eletrodomestico;
import br.edu.infnet.appvenda.model.service.ServicoEletrodomestico;



@Component
public class CarregarEletrodomestico implements ApplicationRunner{
	private ServicoEletrodomestico eletrodomesticoServico;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("file/eletrodomestico.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");		
			
			Eletrodomestico eletronico = new Eletrodomestico();
			
			eletronico.setCodigo(Integer.valueOf(campos[0]));
			eletronico.setDescricao(campos[1]);
			eletronico.setPreco(Float.valueOf(campos[2]));
			eletronico.setEstoque(Boolean.valueOf(campos[3]));
			eletronico.setGarantia(Integer.valueOf(campos[4]));
			eletronico.setMarcar(campos[5]);
			eletronico.setVoltagem(Integer.valueOf(campos[6]));
			
			eletrodomesticoServico.incluir(eletronico);
			System.out.println("Eletronico: " + eletronico);
			linha = leitura.readLine();
		}
		

		for (Eletrodomestico eletronico :  eletrodomesticoServico.obterLista()) {
			System.out.println("Eletrodomestico: " + eletronico);
		}
		
		
		leitura.close();
	}
}
