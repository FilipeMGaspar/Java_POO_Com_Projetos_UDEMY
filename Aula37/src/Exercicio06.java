import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double num;
		String intervalo = "";
		
		System.out.print("Digite um valor: ");
		num = teclado.nextDouble();
		
		if(num > 0 && num < 25) {
			intervalo = "Est� no Intervalo entre [0 e 24]";
		}else if(num < 50) {
			intervalo = "Est� no Intervalo entre [25 e 49]";
		}
		
		System.out.println("\nO N�mero " + num);
		System.out.println(intervalo);
		teclado.close();
	}

}
