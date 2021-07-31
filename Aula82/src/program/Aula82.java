package program;

import java.util.Scanner;

import entidade.ContaNoBanco;

public class Aula82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);		
		char resp;
		int numConta;
		String nomeTitular;
		double depInicial;
		
		System.out.println(" ?? BANCO DE ENSAIO ?? ");
		System.out.println();
		System.out.print("  -> Número da conta : ");
		numConta = teclado.nextInt();
		System.out.print("  -> Nome do Titular : ");
		nomeTitular = teclado.nextLine();
		System.out.print("Deseja fazer um depósito inicial? [S/N] ");
		resp = teclado.nextLine().charAt(0);
		
		if(resp == 'S' || resp == 'S') {
			System.out.print("Qual o Valor a depositar: ");
			depInicial = teclado.nextDouble();
		}
		
		//ContaNoBanco NBalfredo = new ContaNoBanco(1011, "Alfredo");
		//System.out.println(NBalfredo.toString());
		
		
		teclado.close();
	}

}
