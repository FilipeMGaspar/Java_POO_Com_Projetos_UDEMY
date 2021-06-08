import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um valor numérico: ");
		num = teclado.nextInt();
		
		if(num < 0) {
			System.out.println("\n"+ num +" é um número NEGATIVO");
		} else if(num > 0) {
			System.out.println("\n" + num +" é um número POSITIVO");
		} else {
			System.out.println("\n" + num + " é NULO, não positivo nem negativo!");
		}
		
		teclado.close();
	}

}
