import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Exercicio 01 - Soma de dois N�meros!");
		int num1, num2, soma = 0;
		
		
		System.out.print("Primeiro n�mero: ");
		num1 = teclado.nextInt();
		System.out.print("Segundo n�mero: ");
		num2 = teclado.nextInt();
		
		soma = num1 + num2;
		System.out.println("Soma = " + soma);
		
		teclado.close();
	}

}
