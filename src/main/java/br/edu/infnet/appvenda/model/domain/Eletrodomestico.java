package br.edu.infnet.appvenda.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "TEletrodomestico")
public class Eletrodomestico extends Produto{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
