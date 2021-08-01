package entidade;

public class ContaNoBanco {
	//Atributos
	private int numConta;
	private String nomeTitular;
	private double valorDepInicial;
	
	//M�todo construtor		
	public ContaNoBanco(int numConta, String nomeTitular, double valorDepInicial) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.valorDepInicial = valorDepInicial;
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
	
	//M�todo toSting
	@Override
	public String toString() {
		return " Nr. Conta  : " + numConta +
				"\n Titular : " + nomeTitular + 
				"\n Saldo   : "+ valorDepInicial;
	}
	
	//M�todos publicos 
	public double depositar(double deposito) {
		this.setValorDepInicial(this.getValorDepInicial() + deposito);
		double saldo = this.getValorDepInicial();
		return saldo;
	}
	
	public void levantar(double valor) {
		double saldo = this.getValorDepInicial();
		
		if(saldo >= 0 && saldo >= valor) {
			System.out.println("\n");
			System.out.println("Opera��o realizada com sucesso!");
			System.out.println(" Taxa : 5");
			this.setValorDepInicial(this.getValorDepInicial() - valor - 5);
			
		}else {
			System.out.println("\n");
			System.out.println("Opera��o n�o foi realizada! Saldo insuficiente!");
		}
	}
}
