import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int horaInicio, horaFim;
		
		System.out.print("Indique a hora de inicio do jogo: ");
		horaInicio = teclado.nextInt();
		System.out.print("Indique a hora de término do jogo: ");
		horaFim = teclado.nextInt();
		
		if(horaInicio > horaFim) {
			if(horaInicio - horaFim < 1) {
				System.out.println("A duração do jogo deverá ser superior a uma 1 hora");
			}
		}else {
			if((horaInicio - horaFim) * -1 < 1) {
				System.out.println("A duração do jogo deverá ser superior a uma 1 hora");
			}
		}
		
	}

}
