import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exercicio 03 - Diferença do produto !");
		
		Scanner teclado = new Scanner(System.in);
		
		int a, b, c, d;
		int diferenca;
		
		System.out.print("Primeiro número: ");
		a = teclado.nextInt();
		System.out.print("Segundo número: ");
		b = teclado.nextInt();
		System.out.print("Terceiro número: ");
		c = teclado.nextInt();
		System.out.print("Quarto número: ");
		d = teclado.nextInt();
		diferenca = a * b - c * d;
		
		System.out.println("Diferença = " + diferenca);
		
		teclado.close();
	}

}
