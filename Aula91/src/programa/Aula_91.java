package programa;

import java.util.Scanner;

import entidade.Alugar;

public class Aula_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int qtAlugar;
		String nome;
		String email;
		
		Alugar quartos[] = new Alugar[10];  //vetor com 10 quartos
		
		System.out.println(" *** ALuguer de Quartos ***");
		System.out.println();
		System.out.print(" > Quantos quartos deseja reservar: ");
		qtAlugar = teclado.nextInt();
		
		for (int i = 0; i < qtAlugar; i++) {
			System.out.println("\n ## RESERVA " + (i+1) + " de " + qtAlugar + " ## \n");
			teclado.nextLine();
			System.out.print(" -> Nome ...: ");
			nome = teclado.nextLine();
			System.out.print(" -> Email ..: ");
			email = teclado.nextLine();
			
		}
		
		teclado.close();
	}

}
