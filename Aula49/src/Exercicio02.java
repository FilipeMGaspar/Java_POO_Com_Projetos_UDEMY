import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		double x, y;
		
		System.out.print("Coordenada X = ");
		x = teclado.nextDouble();
		System.out.print("Coordenada Y = ");
		y = teclado.nextDouble();
		
		while (x != 0 && y != 0) {
			if(x > 0 && y > 0) {
				System.out.println("Primeiro! \n");
			}else if(x < 0 && y > 0) {
				System.out.println("Segundo! \n");
			}else if(x < 0 && y < 0) {
				System.out.println("Terceiro! \n");
			}else if(x > 0 && y < 0) {
				System.out.println("Quarto! \n");
			}
			System.out.print("Coordenada X = ");
			x = teclado.nextDouble();
			System.out.print("Coordenada Y = ");
			y = teclado.nextDouble();
		}
		
		teclado.close();
	}

}
