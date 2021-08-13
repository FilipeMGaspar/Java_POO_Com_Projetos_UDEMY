package entidade;

public class Profutos {
	//Atributos
	private String nome;
	private double preco;
		
	//Método construtor
	public Profutos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	//Métodos geter e seter
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
