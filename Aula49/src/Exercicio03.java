import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int OpcComb;
		int qtAlcool = 0, qtGasolina = 0, qtDiesel = 0;
		
		while(true) {			
			System.out.println("\t------------------------------");
			System.out.println("\t|  Selecione o Combústivel:  |");
			System.out.println("\t------------------------------");
			System.out.println("\t\t1 - Alcool ");
			System.out.println("\t\t2 - Gasolina ");
			System.out.println("\t\t3 - Diesel ");
			System.out.println("\t\t4 - Sair ");
			System.out.println("\t------------------------------");
			System.out.print("\t Opção ..: ");
			OpcComb = teclado.nextInt();
			if(OpcComb == 1) {
				qtAlcool++;
			}else if(OpcComb == 2) {
				qtGasolina++;
			}else if(OpcComb == 3) {
				qtDiesel++;
			}
			
			if(OpcComb == 4) {
				break;
			}
		}
		//teclado.close();
		System.out.println("\n=========================");
		System.out.println("  Muito Obrigado!\n");
		System.out.println("   ..: Alcool   : " + qtAlcool);
		System.out.println("   ..: Gasolina : " + qtGasolina);
		System.out.println("   ..: Diesel   : " + qtDiesel);
	}

}

/* 
 * 	1 - Alcool 
 * 	2 - Gasolina
 * 	3 - Diesel
 * 	4 - Sair
 * 
 */
 