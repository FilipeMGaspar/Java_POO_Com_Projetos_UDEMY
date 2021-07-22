package Entidade;

public class Produto {
	//Atributos
	private String nome;
	private Double preco;
	private int quantidade;
	
	//M�todos p�blicos
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
	
	//M�todos geter e seter
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
	
	//M�todo detalhes
	public void detalhesProduto() {
		System.out.println("\nDetalhes do pruduto:");
		System.out.println("  ..: " + this.getNome() + " "+this.getPreco() + " " + this.getQuantidade() + " Un" + " Valor total: " + this.ValorTotalEmStock());
	}
	
}
