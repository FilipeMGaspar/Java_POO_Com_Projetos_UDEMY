import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int tenta = 1;
		int num = (int)(Math.random() * 10);
		
		while(tenta < 4) {
			System.out.println("Tentativa " + tenta + " de 3");
			tenta++;
		}
		
		teclado.close();
	}

}
