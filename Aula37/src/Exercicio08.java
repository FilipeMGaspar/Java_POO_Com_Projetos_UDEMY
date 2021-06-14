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
		}else if(salario <= 3000) {
			imposto = 8; //Imposto será de 8%
			valorImp = (salario - 2000 )* imposto /100;

		}else if(salario <= 4500) {
			imposto = 18; //Imposto será 18%
			double baseTrib = salario - 2000;
			System.out.println(baseTrib);
			//valorImp =((salario - 2000) * 8 /100) + ((salario - 3000) * imposto /100); 
		}
		
		System.out.println("\nUma renda de R$ " + salario +"\n  Paga R$ "+ valorImp +" de imposto de renda");
		teclado.close();
	}

}
