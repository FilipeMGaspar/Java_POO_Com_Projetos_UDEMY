package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Aula_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Informe as medidas para o Triângulo X");
		System.out.print("A= ");
		x.a = teclado.nextDouble();
		System.out.print("B= ");
		x.b = teclado.nextDouble();
		System.out.print("C= ");
		x.c= teclado.nextDouble();
		//pX = (xA + xB + xC)/2;
		//areaX = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));
		
		System.out.println("\nInforme as medidas para o Triângulo Y");
		System.out.print("A= ");
		yA = teclado.nextDouble();
		System.out.print("B= ");
		yB = teclado.nextDouble();
		System.out.print("C= ");
		yC = teclado.nextDouble();
		//pY = (yA + yB + yC) / 2;
		//areaY = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));
		
		
		//System.out.printf("\nÁrea do triângulo X= %.4f \n", areaX);
		//System.out.printf("Área do triângulo Y= %.4f \n", areaY);
		
		//System.out.print("\nO triangulo com maior área é o Triângulo");
		
		/*if(areaX > areaY) {
			System.out.print(" X \n");
		}else {
			System.out.print(" Y \n");
		}*/
		
		teclado.close();
	}

}
