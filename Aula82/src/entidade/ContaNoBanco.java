package entidade;

public class ContaNoBanco {
	//Atributos
	private int numConta;
	private String nomeTitular;
	private double valorDepInicial;
	
	//Métodos construtores
	public ContaNoBanco(int numConta, String nomeTitular) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
	}
		
	public ContaNoBanco(int numConta, String nomeTitular, double valorDepInicial) {
		super();
		this.numConta = numConta;
		this.nomeTitular = nomeTitular;
		this.valorDepInicial = valorDepInicial;
	}


	//Métodos Geter e seter
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
	
	//Método toSting
	@Override
	public String toString() {
		return "ContaNoBanco [numConta=" + numConta + ", nomeTitular=" + nomeTitular + ", valorDepInicial="
				+ valorDepInicial + "]";
	}
	
}
