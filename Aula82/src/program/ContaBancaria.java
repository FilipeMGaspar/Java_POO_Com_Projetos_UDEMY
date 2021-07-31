package program;

public class ContaBancaria {
	//Atributos
	private int numConta;
	private String nomeTitular;
	private double valorDepInicial;
	
	//Métodos Geter e seter
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getValorDepInicial() {
		return valorDepInicial;
	}
	public void setValorDepInicial(double valorDepInicial) {
		this.valorDepInicial = valorDepInicial;
	}
	
}
