package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		System.out.println(" *** Ficha de empregado *** ");
		System.out.println();
		System.out.print(" Nome .....: ");
		System.out.print(" Salário ..: ");
		System.out.print(" Imposto ..: ");
		Empregado emp1 = new Empregado();
		
		emp1.setNome(null);
		
		teclado.close();
	}

}
