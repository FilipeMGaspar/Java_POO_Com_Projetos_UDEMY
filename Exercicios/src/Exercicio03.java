import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Crie um programa que efetue a leitura de um nome
		// exiba a mensagem �ol� nome informado�.
		
		Scanner teclado = new Scanner(System.in);
		String nome;
		System.out.print("Qual � o seu nome? ");
		nome = teclado.nextLine();
		
		teclado.close();
	}

}
