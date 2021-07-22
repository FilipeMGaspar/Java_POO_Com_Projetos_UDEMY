package Aplicacao;

import java.util.Scanner;

import Entidade.Produto;

public class Aula_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Produto tv = new Produto();
		//tv.AdicionarProduto(1);
		//tv.RemoverProduto(2);
		
		System.out.println("Criação de produto");
		System.out.print(" -> Nome ........: ");
		tv.setNome(teclado.nextLine());
		System.out.print(" -> Preço .......: ");
		tv.setPreco(teclado.nextDouble());
		System.out.print(" -> Quantidade ..: ");
		tv.setQuantidade(teclado.nextInt());
		tv.detalhesProduto();
		tv.AdicionarProduto(2);
		
		tv.detalhesProduto();
		teclado.close();
	}

}
