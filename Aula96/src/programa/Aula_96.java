package programa;

import java.util.Scanner;

public class Aula_96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numEmp;
		
		System.out.println(" ..: Gest�o de Funcion�rios :.. \n");
		System.out.print(" Quantos funcion�rios deseja registar: ");
		numEmp = teclado.nextInt();
		
		for(int i = 0; i < numEmp; i++) {
			System.out.println();
			System.out.println("Funcion�rio " + (i + 1) + " de " + numEmp);
		}
		teclado.close();
	}

}
