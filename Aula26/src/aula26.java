import java.util.Scanner;

public class aula26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		
		
		
		sc.close();//Fecha o recurso do scanner
	}

}
