package br.edu.infnet.appvenda.model.domain;

public class Moveis extends Produto{
	private String material;
	private String cor;
	
	
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String toString() {
		return String.format("%s - %s - %s", super.toString(), material, cor);
	}
	
}
