import java.util.Scanner;

public class Aula_55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double tempCels;
		double temFahr;
		char resp;
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			tempCels = teclado.nextDouble();
			temFahr = (9 * tempCels / 5) + 32;
			System.out.println("Equivalente em Fahrenheit: " + temFahr + "\n");
			System.out.print("Desja repetir (s/n)? ");
			resp = teclado.next().charAt(0);
		}while(resp != 'n' && resp != 'N');
		teclado.close();
	}

}
