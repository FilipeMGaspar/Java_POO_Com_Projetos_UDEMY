import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um programa que exiba a tabuada 
		//de um n�mero informado pelo usu�rio.
		int numTab;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o n�mero da tabuada: ");
		numTab = teclado.nextInt();
		System.out.println("Tabuada do " + numTab);
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		teclado.close();
	}

}
