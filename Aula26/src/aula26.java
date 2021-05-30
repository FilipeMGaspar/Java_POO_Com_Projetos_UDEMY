import java.util.Locale;
import java.util.Scanner;

public class aula26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); //Leitura de dados
		
		//Leitura de uma String
		System.out.print("Digte o seu nome: ");
		String x;
		x = sc.next(); 
		System.out.println("Seja bem vindo(a): "+ x);
		
		//Leitura de um valor  Inteiro
		int y;
		System.out.print("Digite a sua idade: ");
		y = sc.nextInt();
		System.out.println("Com " + y +" anos");
		
		//Leitor de um valor double
		double z;
		System.out.print("Qual o seu peso: (Kg): ");
		z = sc.nextDouble();
		System.out.println("Com o peso de " + z + " Kg");
		
		//Leitura de um char
		char c;
		System.out.print("Digite uma letra: ");
		c = sc.next().charAt(0);
		System.out.println("Caracter recebido: " + c);
		
		sc.close();//Fecha o recurso do scanner
	}

}
