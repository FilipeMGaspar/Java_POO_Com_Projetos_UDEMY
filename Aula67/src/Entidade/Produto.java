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
		this.setQuantidade(this.getQuantidade() + qt);
		this.detalhesProduto();
	}
	
	public void RemoverProduto(int qt) {
		if(this.quantidade > 0 && qt <= this.quantidade) {
			this.quantidade -= qt;
			this.detalhesProduto();
		}else {
			System.out.println("Produto sem Stock suficiente!");
			System.out.println("  ..: Quantidade: " + this.getQuantidade());
		}
	}
	
	//Métodos geter e seter
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public double getPreco() {
		return this.preco;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidade() {
		return this.quantidade;
	}
	
	//Método detalhes
	public void detalhesProduto() {
		System.out.println("\nDetalhes do pruduto:");
		System.out.printf("  ..: %s, R$ %.2f, %d Un, Valor Total: R$ %.2f ",this.getNome(), this.getPreco(), this.getQuantidade(), this.ValorTotalEmStock());
	}
	
}
