package br.edu.infnet.appvenda.model.domain;

public class Eletrodomestico extends Produto{
	private String marcar;
	private int voltagem;
	private int garantia;
	public String getMarcar() {
		return marcar;
	}
	public void setMarcar(String marcar) {
		this.marcar = marcar;
	}
	public int getVoltagem() {
		return voltagem;
	}
	public void setVoltagem(int voltagem) {
		this.voltagem = voltagem;
	}
	public int getGarantia() {
		return garantia;
	}
	public void setGarantia(int garantia) {
		this.garantia = garantia;
	}
	
	
	public String toString() {
		return String.format("%s - %s - %s - %s", super.toString(), marcar, voltagem, garantia);
	}
	
}
