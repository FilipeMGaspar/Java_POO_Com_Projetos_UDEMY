import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int codProd, qt;
		double preco;
		
		System.out.println("-----------------------------------------------------");
		System.out.println("| CODIGO |\t|   ESPECIFICAÇÃO   |\t|   PREÇO   |");
		System.out.println("-----------------------------------------------------");
		System.out.println("|    1    \t   Cachorro Quente \t   R$ 4.00  |");
		System.out.println("|    2    \t   X-Salada        \t   R$ 4.50  |");
		System.out.println("|    3    \t   X-Bacon         \t   R$ 5.00  |");
		System.out.println("|    4    \t   Torrada Simples \t   R$ 2.00  |");
		System.out.println("|    5    \t   Refrigerante    \t   R$ 1.50  |");
		System.out.println("-----------------------------------------------------");
		System.out.print("\n Selecione um código: ");
		codProd = teclado.nextInt();
		if (codProd < 1 || codProd > 5) {
			System.out.println("\n ERRO[023] ..: Código Inválido. Impossivel Continuar!");
		}else {
			System.out.print("\nQuantidade desejada: ");
			qt = teclado.nextInt();
			if(codProd == 1) {
				preco = 4.00;				
				System.out.println("\n  Cachorro Quente |" + qt +" un | R$ "+ preco * qt);
			} else if(codProd == 2) {
				preco = 4.50;				
				System.out.println("\n  X-Salada | " + qt +" un | R$ "+ preco * qt);
			}else if(codProd == 3) {
				preco = 5.00;				
				System.out.println("\n  X-Bacon | " + qt +" un | R$ "+ preco * qt);
			}
		}
		teclado.close();
	}

}