import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double x, y;
		String local = "";
		
		System.out.print("Coordenada no Eixo do X: ");
		x = teclado.nextDouble();
		System.out.print("Coordenada no Eixo do Y: ");
		y = teclado.nextDouble();
		
		if(x == 0 && y == 0) {
			local = "Origem";
		}
		
		System.out.println("\nO Ponto com as cordenadas " + x +" , " + y + " está na(o): " );
		System.out.println("\n\t" + local);
		
		teclado.close();
	}

}
