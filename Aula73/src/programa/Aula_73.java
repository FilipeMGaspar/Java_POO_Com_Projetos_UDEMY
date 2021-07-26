package programa;

import java.util.Scanner;

import entidade.CurrencyConverter;

public class Aula_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		CurrencyConverter dolarReal = new CurrencyConverter();
		
		System.out.print("Valor do Dolar: ");
		dolarReal.setPrecoDolar(teclado.nextDouble());
		System.out.print("Valor de dolar as comprar: ");
		dolarReal.setQtDolaresComprar(teclado.nextDouble());
		
		System.out.println("Valor a pagar em reais: " + dolarReal.valorPagoReais());
		teclado.close();
	}

}
