import java.util.Scanner;

public class Aula35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int horas;
		
		System.out.print("Quantas horas s�o? ");
		horas = teclado.nextInt();
		
		if(horas < 12) {
			System.out.println("Bom Dia!");
			
		}else {
			if(horas < 18) {
				System.out.println("Boa Tarde!");
			}
			else {
				System.out.println("Boa Noite!");
			}
		}
		
		teclado.close();
	}

}
