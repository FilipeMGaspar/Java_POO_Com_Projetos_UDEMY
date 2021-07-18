package Entidade;

public class Produto {
	//Atributos
	private String nome;
	private Double preco;
	private int quantidade;
	
	//Métodos públicos
	public double ValorTotalEmStock() {
		return this.quantidade * this.preco;
	}
	
	public void AdicionarProduto(int qt) {
		this.quantidade += qt;
	}
	
	public void RemoverProduto(int qt) {
		if(this.quantidade > 0 && qt <= this.quantidade) {
			this.quantidade -= qt;
		}else {
			System.out.println("Produto sem Stock suficiente!");
			System.out.println("  ..: Quantidade: " + this.quantidade);
		}
	}
}
