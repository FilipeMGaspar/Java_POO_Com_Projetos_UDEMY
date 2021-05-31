import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Exercicio 04 - Salário do funcionário!");
		
		int numFunc, horasTrab;
		double valorHora, vencimento;
		
		System.out.print("Número Do funcionário: ");
		numFunc = teclado.nextInt();
		System.out.print("Horas trabalhadas: ");
		horasTrab = teclado.nextInt();
		System.out.print("Valor a pagar por Hora: ");
		valorHora = teclado.nextDouble();

		vencimento = valorHora * horasTrab;
		
		System.out.println("..: Folha de Vencimento :..");
		System.out.println("  Funcionário número: " + numFunc);
		System.out.printf("  Vencimento: %.2f /n", vencimento);
		teclado.close();
	}

}
