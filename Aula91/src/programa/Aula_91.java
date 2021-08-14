package programa;

import java.util.Scanner;

import entidade.Alugar;

public class Aula_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int qtAlugar;
		
		Alugar quartos[] = new Alugar[10];  //vetor com 10 quartos
		
		System.out.println(" *** ALuguer de Quartos ***");
		System.out.println();
		System.out.print(" > Quantos quartos deseja reservar: ");
		qtAlugar = teclado.nextInt();
		
		for (int i = 0; i < qtAlugar; i++) {
			System.out.println("\n ## RESERVA " + (i+1) + " de " + qtAlugar + " ##");
		}
		
		teclado.close();
	}

}
