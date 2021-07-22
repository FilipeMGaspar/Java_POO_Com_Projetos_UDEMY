package Aplicacao;

import java.util.Scanner;

import Entidade.Produto;

public class Aula_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Produto tv = new Produto();
		int qt;
		
		System.out.println("..: Criação de produto :.. ");
		System.out.print(" -> Nome ........: ");
		tv.setNome(teclado.nextLine());
		System.out.print(" -> Preço .......: ");
		tv.setPreco(teclado.nextDouble());
		System.out.print(" -> Quantidade ..: ");
		tv.setQuantidade(teclado.nextInt());
		tv.detalhesProduto();
		
		System.out.println("\n\n---------------------------------");
		System.out.print("Quantidade a remover do Stock: ");
		qt = teclado.nextInt();
		tv.RemoverProduto(qt);
		
		System.out.println("\n\n---------------------------------");
		System.out.print("Qauntidade a adicionar ao Stock: ");
		qt = teclado.nextInt();
		tv.AdicionarProduto(qt);
		
		teclado.close();
	}

}
