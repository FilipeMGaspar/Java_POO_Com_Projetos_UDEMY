package aula99;

import java.util.Scanner;

public class Aula_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("N�mero de linhas e colunas: ");
		int n = sc.nextInt();
		int[][] mat = new int[n][n];
		
		for(int i = 0; i < n; i++) { //Percorre as linhas
			for(int j = 0; j < n; j++) { //precorre as colunas
				System.out.print("["+i+"]["+j+"]");
				mat[i][j] = sc.nextInt();
			}
		}
		
		sc.close();
	}

}
