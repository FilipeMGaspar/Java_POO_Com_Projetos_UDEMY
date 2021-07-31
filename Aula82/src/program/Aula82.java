package program;

import java.util.Scanner;

import entidade.ContaNoBanco;

public class Aula82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);		
		char resp;
		int numConta;
		String nomeTitular;
		double depInicial, deposito, levantamento;
		
		System.out.println(" ?? BANCO DE ENSAIO ?? ");
		System.out.println();
		System.out.print("  -> N�mero da conta : ");
		numConta = teclado.nextInt();
		
		System.out.print("  -> Nome do Titular : ");
		teclado.nextLine();
		nomeTitular = teclado.nextLine();
		
		System.out.print("  -> Deseja fazer um dep�sito inicial? [S/N] ");
		resp = teclado.nextLine().charAt(0);
		
		if(resp == 'S' || resp == 's') {
			System.out.print(" -> Qual o Valor a depositar: ");
			depInicial = teclado.nextDouble();
		}else {
			depInicial = 0;
		}		
		
		ContaNoBanco cnbNb_501 = new ContaNoBanco(numConta, nomeTitular, depInicial);
		System.out.println();
		System.out.println("Detalhes da Conta: ");
		System.out.println(cnbNb_501.toString());
		
		System.out.println();
		System.out.print("Valor do Deposito: ");
		deposito = teclado.nextDouble();
		cnbNb_501.depositar(deposito);
		
		System.out.println("Dep�sito efectuado com sucesso!");
		System.out.println("\nAtualiza��o de Movimentos!");
		System.out.println(cnbNb_501.toString());
		
		System.out.println();
		System.out.print("Qual o valor a levantar: ");
		levantamento = teclado.nextDouble();
		
		teclado.close();
	}

}
