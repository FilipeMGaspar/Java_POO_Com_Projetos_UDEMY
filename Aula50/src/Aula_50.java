import java.util.Scanner;

public class Aula_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int qtDeNum, num;
		
		System.out.print("Quantos números deseja somar? ");
		qtDeNum = teclado.nextInt();		
		for(int i = 1; i <= qtDeNum; i++) {
			System.out.println("Nº " + i + ": ");
			num = teclado.nextInt();
		}
		
		teclado.close();
	}

}
