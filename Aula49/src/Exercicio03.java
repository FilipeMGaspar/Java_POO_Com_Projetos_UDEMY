import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int OpcComb;
		
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
			if(OpcComb == 4) {
				break;
			}
		}
		//teclado.close();
	}

}

/* 
 * 	1 - Alcool 
 * 	2 - Gasolina
 * 	3 - Diesel
 * 	4 - Sair
 * 
 */
 