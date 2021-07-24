package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Empregado emp1 = new Empregado();
		
		System.out.println(" *** Criação da Ficha de empregado *** ");
		System.out.println();
		System.out.print(" Nome .....: ");
		emp1.setNome(teclado.nextLine());
		System.out.print(" Salário ..: ");
		emp1.setSalario(teclado.nextDouble());
		System.out.print(" Imposto ..: ");
		emp1.setImposto(teclado.nextDouble());
		
		emp1.detalhesFuncionario();		
		
		System.out.println();
		System.out.print("Percentagem de aumanto ao salário: ");
		emp1.aumentoDoSalario(teclado.nextDouble());
		
		System.out.println("\nSalário atualizado com sucesso.");
		emp1.detalhesFuncionario();
		
		teclado.close();
	}

}
