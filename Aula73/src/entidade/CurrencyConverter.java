package entidade;

public class CurrencyConverter {
	//Atributos
	final private double IOF = 1.06; //6%
	private double precoDolar;
	private double qtDolaresComprar;
	
	//M�todos geter e Seter
	private double getPrecoDolar() {
		return this.precoDolar;
	}
	public void setPrecoDolar(double precoDolar) {
		this.precoDolar = precoDolar;
	}
	
	private double getQtDolaresComprar() {
		return this.qtDolaresComprar;
	}
	public void setQtDolaresComprar(double qtDolaresComprar) {
		this.qtDolaresComprar = qtDolaresComprar;
	}
	
	//M�todos p�blicos
	public double valorPagoReais() {
		return (this.getPrecoDolar()  * this.getQtDolaresComprar()) * IOF;
	}
}
