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
		
		System.out.println(" ..: Gest�o de Funcion�rios :.. \n");
		System.out.print(" Quantos funcion�rios deseja registar: ");
		numEmp = teclado.nextInt();
		
		List<Empregado> lista = new ArrayList();
		
		for(int i = 0; i < numEmp; i++) {
			System.out.println();
			System.out.println("Funcion�rio " + (i + 1) + " de " + numEmp);
			System.out.print("  -> ID .......: ");
			idEmp = teclado.nextInt();
			System.out.print("  -> NOME .....: ");
			teclado.nextLine();
			nome = teclado.nextLine();
			System.out.print("  -> Sal�rio ..: ");
			salario = teclado.nextDouble();
			
			Empregado func = new Empregado(idEmp, nome, salario);
			
			lista.add(func); //Adicionar empregado � lista
		}
		
		System.out.println();
		System.out.println("-------------------------------------");
		for(Empregado emp : lista) {
			System.out.println(emp.toString());
		}
		
		System.out.println();
		System.out.println("=======================================");
		System.out.println(" ** Aumento de sal�rio ** ");
		System.out.println();
		System.out.print("  -> ID ..: ");
		int idFunc = teclado.nextInt();
		Integer pos = position(lista, idFunc);
		
		
		teclado.close();
	}

	public static Integer position(List<Empregado> lista, int idFunc) {//M�todo para encontar o id de funcion�rio na lista
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == idFunc) {
				return i;
			}
		}
		return null;
	}
}
