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
		System.out.println("Funcionário 1");
		System.out.println(func1.toString());
		
		System.out.println("\n ** Inscrição do funcionário: **");
		System.out.print(" > Nome : ");
		nome = teclado.nextLine();
		System.out.print(" > Salário : ");
		salario = teclado.nextDouble();
		Funcionario func2 = new Funcionario(nome, salario);
		System.out.println();
		System.out.println("Funcionário 2");
		System.out.println(func2.toString());
		
		System.out.println("\n ** Inscrição do funcionário: **");
		System.out.print("Registo ....: ");
		registo = teclado.nextInt();
		teclado.nextLine();
		System.out.print("Nome .......: ");		
		nome = teclado.nextLine();
		System.out.print("Idade ......: ");
		idade = teclado.nextInt();
		System.out.print("Cargo ......: ");
		cargo = teclado.nextLine();
		System.out.print("Salario ....: ");
		salario = teclado.nextDouble();
		
		Funcionario func3 = new Funcionario(registo, nome, idade, cargo, salario);
		
		System.out.println();
		System.out.println("Funcionário 3");
		System.out.println(func3.toString());
		
		teclado.close();
	}

}
