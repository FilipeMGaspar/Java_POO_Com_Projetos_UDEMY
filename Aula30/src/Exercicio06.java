import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double PI = 3.14159;
		double a, b, c;
		double areaTrigRet, arCirculo;
		
		System.out.print("Indique o primeiro real: ");	
		a = teclado.nextDouble();
		System.out.print("Indique o segundo valor real: ");
		b = teclado.nextDouble();
		System.out.print("Indique o terceiro valor real: ");
		c = teclado.nextDouble();
		
		areaTrigRet = (a*c)/2;
		arCirculo = PI * Math.pow(c, 2);
		
		System.out.printf("Área do triangulo = %.2f \n" , areaTrigRet);
		System.out.printf("Área do Circulo =  %.2f \n" , arCirculo);
	}

}
