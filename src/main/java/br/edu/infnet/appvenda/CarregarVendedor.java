package br.edu.infnet.appvenda;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.appvenda.model.domain.Vendedor;
import br.edu.infnet.appvenda.model.service.ServicoVendedor;


@Component
public class CarregarVendedor implements ApplicationRunner{
	
	@Autowired
	private ServicoVendedor vendedorServico;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		FileReader file = new FileReader("file/vendedor.txt");
		BufferedReader leitura = new BufferedReader(file);
		
		String linha = leitura.readLine();
		String[] campos = null;
		
		while(linha != null) {
			campos = linha.split(";");		
			
			Vendedor vendedor = new Vendedor();
			
			vendedor.setNome(campos[0]);
			vendedor.setCpf(campos[1]);
			vendedor.setEmail(campos[2]);
			
			vendedorServico.incluir(vendedor);
			linha = leitura.readLine();
		}
		
		for (Vendedor vendedor :  vendedorServico.obterLista()) {
			System.out.println("Vendedor: " + vendedor);
		}
		
		leitura.close();
		
	}
	
	
}
