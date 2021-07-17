import java.util.Locale;
import java.util.Scanner;

public class Aula_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Locale.setDefault(Locale.US);
		
		double xA, xB, xC, pX, areaX;
		double yA, yB, yC, pY, areaY;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Informe as medidas para o Triângulo X");
		System.out.print("A= ");
		xA = teclado.nextDouble();
		System.out.print("B= ");
		xB = teclado.nextDouble();
		System.out.print("C= ");
		xC = teclado.nextDouble();
		pX = (xA + xB + xC)/2;
		areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		System.out.println("\nPerimetro= "+ pX);
		System.out.printf("Área= %.2f \n", areaX);
		
		System.out.println("\nInforme as medidas para o Triângulo Y");
		System.out.print("A= ");
		yA = teclado.nextDouble();
		System.out.print("B= ");
		yB = teclado.nextDouble();
		System.out.print("C= ");
		yC = teclado.nextDouble();
		pY = (yA + yB + yC) / 2;
		areaY = Math.sqrt(pY );
		
		teclado.close();
	}

}
