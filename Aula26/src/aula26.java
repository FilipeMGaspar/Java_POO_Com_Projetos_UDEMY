import java.util.Scanner;

public class aula26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //Leitura de dados
		
		System.out.print("Digte o seu nome: ");
		String x;
		x = sc.next();
		System.out.println("Seja bem vindo(a): "+ x);
		
		sc.close();//Fecha o recurso do scanner
	}

}
