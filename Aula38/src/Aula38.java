import java.util.Scanner;

public class Aula38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int minutos;
		double pBase = 50.0, pMintAdic = 2.0;
		System.out.print("Indique os minutos consumidos: ");
		minutos = teclado.nextInt();
		
		System.out.println("\nO valor da sua factura será de: ");
		
		if(minutos > 0 && minutos <= 100) {
			System.out.println("  R$ "+ pBase);
		}else {
			pBase = pBase + ((minutos - 100) * pMintAdic);
			System.out.println("  R$ "+ pBase);
		}
	}

}
