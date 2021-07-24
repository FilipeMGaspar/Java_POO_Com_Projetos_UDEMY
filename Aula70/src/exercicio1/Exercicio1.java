package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Retangulo r1 = new Retangulo();
		System.out.println(" *** Ret‚ngulos ***");
		System.out.println();
		System.out.print("Comprimento do rect‚ngulo? ");
		r1.setComprimento(teclado.nextDouble());
		System.out.print("Largura do rect‚ngulo? ");
		r1.setLargura(teclado.nextDouble());
		
		System.out.printf("\n¡rea = %.2f ", r1.area());
		System.out.printf("\nPerimetro = %.2f ", r1.perimetro());
		System.out.printf("\nDiagonal = %.2f ", r1.diagonal());
		teclado.close();
	}

}
