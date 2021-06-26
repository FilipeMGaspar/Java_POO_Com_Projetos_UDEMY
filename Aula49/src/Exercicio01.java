import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int senha = 2002;
		int pass;
		
		System.out.print("Palavara passe: ");
		pass = teclado.nextInt();
		while (pass != senha) {
			System.out.println("Senha inválida!\n");
			System.out.print("Palavara passe: ");
			pass = teclado.nextInt();
		}
		
		System.out.println("Acesso Permitido\n");
		
		teclado.close();
	}

}
