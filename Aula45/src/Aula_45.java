import java.util.Scanner;

public class Aula_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int num, soma = 0;
		System.out.print("Digite um número: ");
		num = teclado.nextInt();
		if(num != 0) {
			soma += num; 
			while (num != 0) {
				System.out.print("Digite um número: ");
				num = teclado.nextInt();
				if(num != 0) {
					soma += num;
				}
			}
		}
		System.out.println("\n ..: Soma = " + soma);
		teclado.close();
	}

}
