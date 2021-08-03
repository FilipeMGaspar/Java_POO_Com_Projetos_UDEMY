package programa;

import java.util.Scanner;

import entidades.Aluno;

public class Exercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Aluno joao = new Aluno();
		System.out.println("*** Ficha de inscrição ***\n");
		System.out.print("  -> Nº de Matricula .: ");
		joao.setMatricula(teclado.nextLong());
		System.out.print("  -> Nome ............: ");
		joao.setNome(teclado.nextLine());
		teclado.nextLine();//Limpar o buffer do teclado
		System.out.print("  -> Email ...........: ");
		joao.setEmail(teclado.nextLine());
		teclado.nextLine();//Limpar o buffer do teclado
		
		System.out.println("\n");
		System.out.println(joao.toString());
		teclado.close();
	}

}
