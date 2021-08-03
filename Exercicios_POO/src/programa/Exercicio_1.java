package programa;

import java.util.Scanner;

import entidades.Aluno;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Aluno joao = new Aluno();
		System.out.println("*** Ficha de inscrição ***");
		System.out.print("  -> Nº de Matricula .: ");
		joao.setMatricula(teclado.nextLong());
		System.out.println("  -> Nome ............: ");
		System.out.println("  -> Email ...........: ");
		
		teclado.close();
	}

}
