import java.util.Scanner;

public class Aula_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int qtDeNum, num, soma = 0;
		
		System.out.print("Quantos n�meros deseja somar? ");
		qtDeNum = teclado.nextInt();		
		for(int i = 1; i <= qtDeNum; i++) {
			System.out.print("\nN�mero " + i + " de  " + qtDeNum + ": ");
			num = teclado.nextInt();
			soma += num;
		}
		
		teclado.close();
	}

}
