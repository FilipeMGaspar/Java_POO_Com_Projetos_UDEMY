import java.util.Scanner;

public class Aula38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int minutos;
		double pBase = 50;
		System.out.print("Indique os minutos consumidos: ");
		minutos = teclado.nextInt();
		
		System.out.println("\nO valor da sua factura ser� de: ");
		
		if(minutos > 0 && minutos < 100) {
			System.out.println("  R$ "+ pBase);
		}
	}

}
