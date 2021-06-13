import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double num;
		String intervalo = "";
		
		System.out.print("Digite um valor: ");
		num = teclado.nextDouble();
		
		if(num > 0 && num <= 25) {
			intervalo = "Está no Intervalo entre [0 e 25]";
		}else if(num <= 50) {
			intervalo = "Está no Intervalo entre [25 e 50]";
		}else if(num <= 75) {
			intervalo = "Está no Intervalo entre [50 e 75]";
		}
		
		System.out.println("\nO Número " + num);
		System.out.println(intervalo);
		teclado.close();
	}

}
