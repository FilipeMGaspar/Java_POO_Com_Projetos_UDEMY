package Entidade;

public class Produto {
	//Atributos
	private String nome;
	private Double preco;
	private int quantidade;
	
	//M�todos p�blicos
	public void AdicionarProduto(int qt) {
		this.quantidade += qt;
	}
	
	public void RemoverProduto(int qt) {
		
	}
}
