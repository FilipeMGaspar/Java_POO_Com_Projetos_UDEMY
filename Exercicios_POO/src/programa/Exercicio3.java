package programa;

import java.util.Scanner;

import entidades.Professor;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Professor prof = new Professor();
		System.out.println("\n ** Ficha de inscrição de Professores ** \n");
		System.out.print(" -> NOME .......: ");
		prof.setNome(teclado.nextLine());
		teclado.nextLine();
		System.out.println(" -> MATRICULA ..: ");
		
		System.out.println(" -> SALÁRIO ....: ");
		
		teclado.close();
	}

}
