import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int tenta = 1, palpite;
		int num = (int)(Math.random() * 10);
		System.out.println("Vou pensar num n�mero de 0 a 10");
		
		while(tenta < 4) {
			System.out.println("\n-----------------------------");
			System.out.println("Tentativa " + tenta + " de 3");
			System.out.print("  ..: Palpite: " );
			palpite = teclado.nextInt();
			if(palpite < num) {
				System.out.println("\nO n�mero que pensei � menor");
				System.out.println(num);
			}
			
			tenta++;
		}
		
		teclado.close();
	}

}
