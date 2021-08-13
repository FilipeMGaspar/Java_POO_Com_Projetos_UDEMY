package programa;

import java.util.Scanner;

import entidade.Produtos;

public class Aula_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int n;
		
		System.out.print("Quantos produtos deseja registar: ");
		n = teclado.nextInt();
		
		Produtos prod [] = new Produtos[n];
		
		for (int i = 0; i < prod.length; i++) {
			teclado.nextLine();
			System.out.println("\n Produto " + (i+1) + " de " + prod.length);
		}
		
		teclado.close();
	}

}
