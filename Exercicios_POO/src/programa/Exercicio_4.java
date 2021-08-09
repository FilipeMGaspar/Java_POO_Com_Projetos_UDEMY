package programa;

import java.util.Scanner;

import entidades.Funcionario;

public class Exercicio_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int registo;
		String nome;
		int idade;
		String cargo;
		double salario;
		
		Funcionario func1 = new Funcionario();
		System.out.println(func1.toString());
		
		System.out.println("\nInscrição do funcionário:");
		teclado.close();
	}

}
