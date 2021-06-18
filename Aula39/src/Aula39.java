import java.util.Scanner;

public class Aula39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		Scanner teclado = new Scanner(System.in); 
		
		int diaSemana;
		String dia;
		System.out.print("Indique um valor numérico: ");
		diaSemana = teclado.nextInt();
		
		//Utilizando o switch-case
		switch(diaSemana) {
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda feira";
				break;
			case 3:
				dia = "Terça feira";
				break;
			case 4:
				dia = "Quarta feira";
				break;
			case 5:
				dia = "Sexta feira";
				break;
		}
		
		teclado.close();
		/*
		//Utilizando o if else
		if(diaSemana == 1) {
			dia = "Domingo";
		}else if(diaSemana == 2) {
			dia = "Segunda feira";
		}else if(diaSemana == 3) {
			dia = "Terça feira";
		}else if(diaSemana == 4) {
			dia = "Quarta feira";
		}else if(diaSemana == 5) {
			dia = "Quinta feira";
		}else if(diaSemana == 6) {
			dia = "Sexta feira";
		}else {
			dia = "Valor Inválido";
		}
		
		
		System.out.println("\nDia da semana: " + dia);
		teclado.close();
		*/
	}

}
