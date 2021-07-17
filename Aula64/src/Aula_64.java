import java.util.Scanner;

public class Aula_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xA, xB, xC;
		double yA, yB, yC;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe as medidas para o Triângulo X");
		System.out.print("A= ");
		xA = teclado.nextDouble();
		System.out.print("B= ");
		xB = teclado.nextDouble();
		System.out.print("C= ");
		xC = teclado.nextDouble();
		
		System.out.println("\nInforme as medidas para o Triângulo Y");
		teclado.close();
	}

}
