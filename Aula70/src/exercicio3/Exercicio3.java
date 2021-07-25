package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Aluno a = new Aluno();
		System.out.println("|--------------------------------------|");
		System.out.println("| Painel de criação da ficha do aluno! |");
		System.out.println("|--------------------------------------|");
		
		System.out.print("\t Nome .................: ");
		a.setNome(teclado.nextLine());
		System.out.print("Nota primeiro Trimestre .: ");
		a.setNotaPriTrim(teclado.nextDouble());
		System.out.print("Nota segundo Trimestre ..: ");
		a.setNotaSegTrim(teclado.nextDouble());
		System.out.print("Nota terceiro Trimestre ..: ");
		a.setNotaTercTrim(teclado.nextDouble());
		
		teclado.close();
	}

}
