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
		
		System.out.println("\nProduto 2: ");
		System.out.print("   Código     ..: ");
		codProd2 = teclado.nextInt();
		System.out.print("   Quantidade ..: ");
		qtProd2 = teclado.nextInt();
		System.out.print("   Preço      ..: ");
		valorUnP2 = teclado.nextDouble();
		
		System.out.println();
		System.out.println("Cod \t QT \t P.uni \t Total");
		System.out.printf("%d \t %d \t %.2f \t  %.2f \n", codProd1,  qtProd1, valorUnP1, (valorUnP1 * qtProd1));
		System.out.printf("%d \t %d \t %.2f \t  %.2f \n", codProd2,  qtProd2, valorUnP2, (valorUnP2 * qtProd2));
		
		teclado.close();
	}

}
