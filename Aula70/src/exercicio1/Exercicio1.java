package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Retangulo r1 = new Retangulo();
		System.out.println(" *** Retângulos ***");
		System.out.println();
		System.out.println("Comprimento do rectângulo? ");
		r1.setComprimento(teclado.nextDouble());
		System.out.println("Largura do rectângulo? ");
		r1.setLargura(teclado.nextDouble());
		
		System.out.println(r1.area());
		teclado.close();
	}

}
