import java.util.Scanner;

public class Aula39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner teclado = new Scanner(System.in); 
		
		int diaSemana;
		String dia;
		System.out.print("Indique um valor numérico: ");
		diaSemana = teclado.nextInt();
		
		//Utilizando o if else
		if(diaSemana == 1) {
			dia = "Domingo";
		}else if(diaSemana == 2) {
			dia = "Segunda";
		}
		
		teclado.close();
	}

}
