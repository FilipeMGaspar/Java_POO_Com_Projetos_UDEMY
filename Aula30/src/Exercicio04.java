import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Exercicio 04 - Salário do funcionário!");
		
		int numFunc, horasTrab;
		
		System.out.print("Número Do funcionário: ");
		numFunc = teclado.nextInt();
		System.out.print("Horas trabalhadas: ");
		horasTrab = teclado.nextInt();
	}

}
