package entidade;

public class Produtos {
	//Atributos
	private String nome;
	private double preco;
		
	//M�todo construtor
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	//M�todos geter e seter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
		
}
