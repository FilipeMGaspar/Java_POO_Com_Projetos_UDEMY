package exercicio1;

public class retangulo {
	//Atributos
	private double largura;
	private double comprimento;
	
	//Métodos geter e seter
	private double getLargura() {
		return this.largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	private double getComprimento() {
		return this.comprimento;
	}
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}
	
	//Métodos públicos
	public double area() {
		return this.getComprimento() * this.getComprimento();
	}
}
