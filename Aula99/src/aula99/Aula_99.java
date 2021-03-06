package aula99;

import java.util.Scanner;

public class Aula_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N?mero de linhas e colunas: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++) { //Percorre as linhas
			for(int j = 0; j < mat[i].length; j++) { //Percorre as colunas
				System.out.print(" ["+i+"]["+j+"] => ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("\nDiagonal Principal");
		
		for(int i = 0; i < mat.length; i++) { //Diagonal principal
			System.out.print(mat[i][i] + " ");
		}
		
		int qtNumNegativos = 0;
		
		System.out.println();
		for(int i = 0; i < mat.length; i++) { // Percorre as linhas
			for(int j = 0; j < mat[i].length; j++) { //Percorre as colunas
				if(mat[i][j] < 0) {
					qtNumNegativos++;
				}
			}
		}
		System.out.println("Quantidade de N?meros negativos: " + qtNumNegativos);
		
		sc.close();
	}

}
