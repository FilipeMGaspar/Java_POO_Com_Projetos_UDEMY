import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exercicio 03 - Diferen�a do produto !");
		
		Scanner teclado = new Scanner(System.in);
		
		int a, b, c, d;
		int diferenca;
		
		System.out.print("Primeiro n�mero: ");
		a = teclado.nextInt();
		System.out.print("Segundo n�mero: ");
		b = teclado.nextInt();
		System.out.print("Terceiro n�mero: ");
		c = teclado.nextInt();
		System.out.print("Quarto n�mero: ");
		d = teclado.nextInt();
		diferenca = a * b - c * d;
		
		System.out.println("Diferen�a = " + diferenca);
		
		teclado.close();
	}

}
