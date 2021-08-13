package programa;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produtos;

public class Aula_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		int n;
		String nomeProd;
		double precoProd, precoMedio, soma = 0.0;
		
		System.out.print("Quantos produtos deseja registar: ");
		n = teclado.nextInt();
		
		Produtos prod [] = new Produtos[n];
		
		for (int i = 0; i < prod.length; i++) {
			teclado.nextLine();
			System.out.println("\n Produto " + (i+1) + " de " + prod.length);
			System.out.print("  -> NOME ...: ");
			nomeProd = teclado.nextLine();
			System.out.print("  -> PREÇO ..: ");
			precoProd = teclado.nextDouble();
			
			prod[i] = new Produtos(nomeProd, precoProd);
		}
		
		for (int i = 0; i < prod.length; i++) {
			soma += prod[i].getPreco();
		}
		
		precoMedio = soma / prod.length;
		System.out.println();
		System.out.printf("Preço médio dos produtos %.2f ", precoMedio);
		System.out.println();
		
		teclado.close();
	}

}
