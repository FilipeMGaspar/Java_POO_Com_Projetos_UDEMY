import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Exercicio 01 - Soma de dois Números!");
		int num1, num2;
		
		
		System.out.print("Primeiro número: ");
		num1 = teclado.nextInt();
		System.out.println("Segundo número: ");
		num2 = teclado.nextInt();
		
		teclado.close();
	}

}
