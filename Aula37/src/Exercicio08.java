import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double salario;
		int imposto;
		
		System.out.print("Salário Bruto: ");
		salario = teclado.nextDouble();
		
		if(salario > 0 && salario <=2000) {
			imposto = 0;
		}
		teclado.close();
	}

}
