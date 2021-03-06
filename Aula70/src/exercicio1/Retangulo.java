package exercicio1;

public class Retangulo {
	//Atributos
	private double largura;
	private double comprimento;
	
	//M?todos geter e seter
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
	
	//M?todos p?blicos
	public double area() {
		return this.getComprimento() * this.getLargura();
	}
	
	public double perimetro() {
		return 2 * this.getComprimento() + 2 * this.getLargura();
	}
	
	public double diagonal(){
		double diag = Math.sqrt(Math.pow(this.getComprimento(), 2) + Math.pow(this.getLargura(), 2));;
		
		return diag;
	}
}
