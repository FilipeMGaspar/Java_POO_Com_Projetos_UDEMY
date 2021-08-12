package programa;

import java.util.Locale;
import java.util.Scanner;

public class Aula_89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numElem;
		double soma = 0.0 , media;
		
		System.out.print("Indique o número de alturas a registar: ");
		numElem = teclado.nextInt();
		
		double[] vet = new double [numElem];
		System.out.println();
		for (int i = 0; i < numElem; i++) {
			System.out.print("Indique a " + (i+1) + "ª altura: ");
			vet[i] = teclado.nextDouble();
		}
		
		for (int i = 0; i < numElem; i++) {
			soma += vet[i];
		}
		
		media = soma / numElem;
		
		System.out.println();
		System.out.printf("A média das %d alturas é de %.2f ", numElem, media);
		System.out.println();
		teclado.close();
		
		/*Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i=0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		sc.close();*/
	}

}
