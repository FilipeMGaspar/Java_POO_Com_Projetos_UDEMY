package programa;

import java.util.Scanner;

import entidades.Professor;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Professor prof = new Professor();
		System.out.println("\n ** Ficha de inscri��o de Professores ** \n");
		System.out.print(" -> NOME .......: ");
		prof.setNome(teclado.nextLine());
		//teclado.nextLine();
		System.out.println(" -> MATRICULA ..: ");
		prof.setMatricula(teclado.nextLong());
		System.out.println(" -> SAL�RIO ....: ");
		prof.setSalario(teclado.nextDouble());
		System.out.println("\n\n ");
		System.out.println(prof.toString());
		teclado.close();
	}

}
