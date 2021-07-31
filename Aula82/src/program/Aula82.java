package program;

import java.util.Scanner;

import entidade.ContaNoBanco;

public class Aula82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);		
		int numConta;
		String nomeTitular;
		
		System.out.println(" ?? BANCO DE ENSAIO ?? ");
		System.out.println();
		System.out.print("  -> Número da conta : ");
		numConta = teclado.nextInt();
		System.out.print("  -> Nome do Titular : ");
		nomeTitular = teclado.nextLine();
		
		
		//ContaNoBanco NBalfredo = new ContaNoBanco(1011, "Alfredo");
		//System.out.println(NBalfredo.toString());
		
		
		teclado.close();
	}

}
