import java.util.Locale;
import java.util.Scanner;

public class Aula_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double largura;
		double comprimento;
		double precoMetroQuadrado;
		
		System.out.print("Indique a largura do terreno: ");
		largura = teclado.nextDouble();
		System.out.println("Indique o comprimento do terreno: ");
		comprimento = teclado.nextDouble();
		
		double area = largura * comprimento;
		
		System.out.printf("\nAREA = %.2f \n", area);
		System.out.printf("PRECO = \n");
		
		teclado.close();
	}

}
