package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Empregado;

public class Aula_96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numEmp;
		Integer idEmp;
		String nome;
		Double salario;
		
		System.out.println(" ..: Gestão de Funcionários :.. \n");
		System.out.print(" Quantos funcionários deseja registar: ");
		numEmp = teclado.nextInt();
		
		List<Empregado> lista = new ArrayList();
		
		for(int i = 0; i < numEmp; i++) {
			System.out.println();
			System.out.println("Funcionário " + (i + 1) + " de " + numEmp);
			System.out.print("  -> ID .......: ");
			idEmp = teclado.nextInt();
			System.out.print("  -> NOME .....: ");
			teclado.nextLine();
			nome = teclado.nextLine();
			System.out.print("  -> Salário ..: ");
			salario = teclado.nextDouble();
			
			Empregado func = new Empregado(idEmp, nome, salario);
			
		}
		
		teclado.close();
	}

}
