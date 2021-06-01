import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Exercicio 05 - Calculadora de valor a ser pago!");
		
		int codProd1, qtProd1, codProd2, qtProd2;
		double valorUnP1, valorUnP2; 
	
		System.out.println("Produto 1: ");
		System.out.print("   Código     ..: ");
		codProd1 = teclado.nextInt();
		System.out.print("   Quantidade ..: ");
		qtProd1 = teclado.nextInt();
		System.out.print("   Preço      ..: ");
		valorUnP1 = teclado.nextDouble();
		
		
	}

}
