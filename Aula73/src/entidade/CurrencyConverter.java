package entidade;

public class CurrencyConverter {
	//Atributos
	final private double IOF = 6 /100;
	private double precoDolar;
	
	//Métodos geter e Seter
	public double getPrecoDolar() {
		return this.precoDolar;
	}
	public void setPrecoDolar(double precoDolar) {
		this.precoDolar = precoDolar;
	}
	
	//Métodos públicos
	public double valorPagoReais() {
		return 0.00;
	}
}
