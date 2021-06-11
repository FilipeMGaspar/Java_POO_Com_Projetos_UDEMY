import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int horaInicio, horaFim;
		int duracao;
		
		System.out.print("Indique a hora de inicio do jogo: ");
		horaInicio = teclado.nextInt();
		System.out.print("Indique a hora de término do jogo: ");
		horaFim = teclado.nextInt();
		
		duracao = horaInicio - horaFim;
		
		if(duracao < 0) {
			duracao *= -1;
		}else if(duracao == 0) {
			duracao = 24;
		}else {
			duracao = 24 - horaInicio + horaFim;
		}
		System.out.println("\nDuracao do jogo: " + duracao + " hora(s)");
		
	}

}
