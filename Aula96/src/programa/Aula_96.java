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
			
			lista.add(func); //Adicionar empregado á lista
		}
		
		System.out.println();
		System.out.println("-------------------------------------");
		for(Empregado emp : lista) {
			System.out.println(emp.toString());
		}
		
		System.out.println();
		System.out.println("=======================================");
		System.out.println(" ** Aumento de salário ** ");
		System.out.println();
		System.out.print("  -> ID ..: ");
		int idFunc = teclado.nextInt();
		
		//Integer pos = position(lista, idFunc);
		
		Empregado emp = lista.stream().filter(x -> x.getId() == idFunc).findFirst().orElse(null);
		
		//System.out.println("Posição : " + pos);//Com
		System.out.print("Qual a percentagem do aumento: ");
		
		teclado.close();
	}

	public static Integer position(List<Empregado> lista, int idFunc) {//Método para encontar o id de funcionário na lista
		for (int i = 0; i < lista.size(); i++) {
			if(lista.get(i).getId() == idFunc) {
				return i;
			}
		}
		return null;
	}
}

/*
 Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			System.out.println();
			System.out.println("Emplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Id already taken! Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase : ");
		int idsalary = sc.nextInt();

		// Integer pos = position(list, idsalary);
		
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		// if (pos == null) {
		if (emp == null) {
			System.out.println("This id does not exist!");
		}
		else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			//list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		for (Employee e : list) {
			System.out.println(e);
		}		
		
		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
	
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
 * */
