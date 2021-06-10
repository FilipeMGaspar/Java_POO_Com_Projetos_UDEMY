import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num;
		
		System.out.print("Indique um número: ");
		num = teclado.nextInt();
		
		if(num%2 == 0) {
			System.out.println("\n O número "+ num +" é PAR!");
		}
		
		teclado.close();
	}

}
