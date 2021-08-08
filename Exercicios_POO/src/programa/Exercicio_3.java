package programa;

import java.util.Scanner;

import entidades.Professor;

public class Exercicio_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Professor prof = new Professor();
		System.out.println("\n ** Ficha de inscrição de Professores ** \n");
		System.out.print(" -> NOME .......: ");
		prof.setNome(teclado.nextLine());
		//teclado.nextLine();
		System.out.print(" -> MATRICULA ..: ");
		prof.setMatricula(teclado.nextLong());
		System.out.print(" -> SALÁRIO ....: ");
		prof.setSalario(teclado.nextDouble());
		System.out.println("\n\n ");
		System.out.println(prof.toString());
		teclado.close();
	}

}
