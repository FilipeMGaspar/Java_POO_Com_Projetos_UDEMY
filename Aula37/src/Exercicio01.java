import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um valor num�rico: ");
		num = teclado.nextInt();
		
		if(num < 0) {
			System.out.println("\n"+ num +" � um n�mero NEGATIVO");
		} else if(num > 0) {
			System.out.println("\n" + num +" � um n�mero POSITIVO");
		}
		
		teclado.close();
	}

}
