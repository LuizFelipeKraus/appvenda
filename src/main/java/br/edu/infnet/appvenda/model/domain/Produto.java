package br.edu.infnet.appvenda.model.domain;

public class Produto {
	private int codigo;
	private String descricao;
	private float preco;
	private boolean estoque;
	
	
	public boolean isEstoque() {
		return estoque;
	}
	public void setEstoque(boolean estoque) {
		this.estoque = estoque;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return String.format("%s - %s - %s - %s", codigo, descricao, preco, estoque);
	}
	
}
