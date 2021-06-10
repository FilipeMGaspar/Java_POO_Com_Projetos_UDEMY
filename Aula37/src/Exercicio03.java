import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num1, num2;
		int div;
		
		System.out.print("Indique um número inteiro: ");
		num1 = teclado.nextInt();
		System.out.print("Indique outro número inteiro: ");
		num2 = teclado.nextInt();
		
		if(num1 > num2) {
			div = num1 % num2;
		}else {
			div = num2 % num1;
		}
		
		if(div == 0) {
			System.out.println("Os números " + num1 + " e " + num2 +" São MULTIPLOS");
		}
		
		teclado.close();
	}

}
