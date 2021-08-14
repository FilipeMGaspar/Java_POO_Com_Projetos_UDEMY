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
		int nrDoQuarto;
		
		Alugar quartos[] = new Alugar[10];  //vetor com 10 quartos
		
		System.out.println(" *** ALuguer de Quartos ***");
		System.out.println();
		System.out.print(" > Quantos quartos deseja reservar: ");
		qtAlugar = teclado.nextInt();
		
		for (int i = 0; i < qtAlugar; i++) {
			System.out.println("\n ## RESERVA " + (i+1) + " de " + qtAlugar + " ## \n");
			teclado.nextLine();
			System.out.print(" -> Nome ..........: ");
			nome = teclado.nextLine();
			System.out.print(" -> Email .........: ");
			email = teclado.nextLine();
			System.out.print(" -> Nº do Quarto ..: ");
			nrDoQuarto = teclado.nextInt();
			
			quartos[nrDoQuarto] = new Alugar(nome, email);
		}
		
		System.out.println();
		System.out.println(" -- Quartos Reservados (Alugados) -- \n");
		
		for(int i = 0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(i + " : " );
			}
		}
		teclado.close();
	}

}
