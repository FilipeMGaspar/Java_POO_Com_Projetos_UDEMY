import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		System.out.println(" \t\t   |");
		System.out.println(" \t\tQ2 | Q1");
		System.out.println(" \t\t   | ");
		System.out.println(" \t   --------|--------");
		System.out.println(" \t\t   |");
		System.out.println(" \t\tQ3 | Q4");
		System.out.println(" \t\t   |");
		
		System.out.println(" \n");
		double x, y;
		String local = "";
		
		System.out.print("Coordenada no Eixo do X: ");
		x = teclado.nextDouble();
		System.out.print("Coordenada no Eixo do Y: ");
		y = teclado.nextDouble();
		
		if(x == 0 && y == 0) {
			local = "Origem";
		}else if(x!=0 && y == 0) {
			local = "Eixo do X";
		}else if(x==0 && y!=0) {
			local = "Eixo do Y";
		}else if(x >0 && y > 0) {
			local = "Q1";
		}else if(x < 0 && y > 0) {
			local = "Q2";
		}else if(x < 0 && y < 0) {
			local = "Q3";
		}else if(x > 0 && y < 0) {
			local = "Q4";
		}
		
		
		System.out.println("\nO Ponto com as cordenadas X= " + x +" , Y= " + y + " está na(o): " );
		System.out.println("\n\t" + local);
		
		teclado.close();
	}

}
