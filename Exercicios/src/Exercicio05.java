import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crie um programa que troque os valores 
		//que est�o armazenados nas vari�veis nome1 e nome2. 
		//A vari�vel nome1 armazenara o valor �mestre do universo�. 
		//A vari�vel nome2 receber� um valor informado pelo usu�rio.
		//Altere os valores das vari�veis 
		//e exiba a soma da vari�vel nome1 com o valor da vari�vel nome2.
		
		Scanner teclado = new Scanner(System.in);
		String nome1 = "mestre do universo";
		String nome2;
		System.out.print("Insira uma frase: ");
		nome2 = teclado.nextLine();
		String nome3 = nome2 + " � " + nome1;
		System.out.println("\n "+nome3);
		teclado.close();
	}

}
