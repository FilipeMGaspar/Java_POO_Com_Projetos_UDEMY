import java.util.Scanner;

public class Aula_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int qtDeNum, num, soma = 0;
		
		System.out.print("Quantos n�meros deseja somar? ");
		qtDeNum = teclado.nextInt();
		System.out.println();
		for(int i = 1; i <= qtDeNum; i++) {
			System.out.print("N�mero " + i + " de  " + qtDeNum + ": ");
			num = teclado.nextInt();
			soma += num;
		}
		
		System.out.println("\nSoma = " + soma+ "\n\n");
		teclado.close();
	}

}
