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
		return "ContaNoBanco"
				+ "\n numConta = " + numConta +
				"\n nomeTitular = " + nomeTitular + 
				"\n valorDepInicial = " + valorDepInicial;
	}
	
	//M�todo publico 
	public double depositar(double deposito) {
		this.setValorDepInicial(this.getValorDepInicial() + deposito);
		double saldo = this.getValorDepInicial();
		return saldo;
	}
}
