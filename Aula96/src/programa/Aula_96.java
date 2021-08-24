package programa;

import java.util.Scanner;

public class Aula_96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numEmp;
		
		System.out.println(" ..: Gestão de Funcionários :.. \n");
		System.out.print(" Quantos funcionários deseja registar: ");
		numEmp = teclado.nextInt();
		
		for(int i = 0; i < numEmp; i++) {
			System.out.println();
			System.out.println("Funcionário " + (i + 1) + " de " + numEmp);
		}
		teclado.close();
	}

}
