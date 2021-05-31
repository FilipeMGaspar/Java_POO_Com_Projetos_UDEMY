import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exercicio 02 - Área do círculo!");
		
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double PI = 3.14159;
		double raio, area;
		
		System.out.println("Valor do raio: ");
		raio = teclado.nextDouble(); 
		area = PI * Math.pow(raio, 2);
		System.out.println("A = " + area);
		
		teclado.close();
	}

}
