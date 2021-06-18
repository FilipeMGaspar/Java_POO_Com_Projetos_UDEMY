import java.util.Scanner;

public class Aula40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double preco, desconto;
		System.out.print("Qual o preço do produto: ");
		preco = teclado.nextDouble();
		
		//Utilizando o if
		if(preco < 20) {
			desconto = preco * 0.1; //10% de desconto
		}else {
			desconto = preco * 0.05; //5% de desconto
		}
		System.out.println();
		System.out.println("Sub-Total......: " + preco);
		System.out.println("Desconto.......: " + desconto);
		System.out.println("Valor a Pagar..: "+ (preco - desconto));
		teclado.close();
	}

}
