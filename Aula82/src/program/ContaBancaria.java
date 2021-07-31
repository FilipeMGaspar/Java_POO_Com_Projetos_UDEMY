package program;

public class ContaBancaria {
	//Atributos
	private int numConta;
	private String nomeTitular;
	private double valorDepInicial;
	
	//M�todo construtor
	public ContaBancaria(int numConta, String nomeTitular, double valorDepInicial) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.valorDepInicial = 0; //Opcional
	}
	
	//M�todos Geter e seter
	public int getNumConta() {
		return numConta;
	}

	private void setNumConta(int numConta) {
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
