import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double salario, valorImp = 0.0;
		int imposto = 0;
		
		System.out.print("Salário Bruto: ");
		salario = teclado.nextDouble();
		
		if(salario > 0 && salario <=2000) {
			imposto = 0;
			valorImp = salario * imposto;
			System.out.println("\nIsento de imposto!");
		}else if(salario <= 3000) {
			imposto = 8; //Imposto será de 8%
			valorImp = (salario - 2000 )* imposto /100;

		}else if(salario <= 4500) {
			//Neste caso o imposto passa a 18% aos 3000.01
			//Logo 1000 serão taxados a 8% e o restante a 18% 
			imposto = 18; //Imposto será 18%
			valorImp =(1000 * 8 /100) + ((salario - 3000) * imposto /100);
			
		}else {
			//Neste caso o imposto passa a 28% aos 4500.01
			// 1000 serão taxados a 8% 
			// 1500 serão taxados a 18%
			//O restante a 28%
			imposto = 28; //Imposto passa a 28%
			valorImp = (1000*8/100) +(1500*18/100) + ((salario - 4500) * imposto/100);
		}
		
		System.out.println("Uma renda de R$ " + salario +"\n  Paga R$ "+ valorImp +" de imposto de renda");
		teclado.close();
	}

}
