import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um programa que exiba a tabuada 
		//de um número informado pelo usuário.
		int numTab;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o número da tabuada: ");
		numTab = teclado.nextInt();
		System.out.println("\nTabuada do " + numTab + "\n");
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + " X " + numTab + " = "+(i*numTab));
		}
		teclado.close();
	}

}
