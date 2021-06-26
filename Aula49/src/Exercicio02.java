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
				System.out.println("Primeiro!");
			}else if(x < 0 && y > 0) {
				System.out.println("Segundo!");
			}else if(x < 0 && y < 0) {
				System.out.println("Terceiro!");
			}else if(x > 0 && y < 0) {
				System.out.println("Quarto!");
			}
			System.out.print("Coordenada X = ");
			x = teclado.nextDouble();
			System.out.print("Coordenada Y = ");
			y = teclado.nextDouble();
		}
		
		teclado.close();
	}

}
