package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Aula_66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double pX, areaX;
		double pY, areaY;
		
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
		areaX = x.area();
		
		System.out.println("\nInforme as medidas para o Triângulo Y");
		System.out.print("A= ");
		y.a = teclado.nextDouble();
		System.out.print("B= ");
		y.b = teclado.nextDouble();
		System.out.print("C= ");
		y.c = teclado.nextDouble();
		areaY = y.area();
		
		
		System.out.printf("\nÁrea do triângulo X= %.4f \n", areaX);
		System.out.printf("Área do triângulo Y= %.4f \n", areaY);
		
		System.out.print("\nO triangulo com maior área é o Triângulo");
		
		if(areaX > areaY) {
			System.out.print(" X \n");
		}else {
			System.out.print(" Y \n");
		}
		
		teclado.close();
	}

}
