package aplication;

import java.util.Locale;
import java.util.Scanner;

import entidade.Triangulo;

public class Aula_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner teclado = new Scanner(System.in);
		
		double pX, areaX;
		double pY, areaY;
		
		Triangulo x, y;
		
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Informe as medidas para o Tri�ngulo X");
		System.out.print("A= ");
		x.a = teclado.nextDouble();
		System.out.print("B= ");
		x.b = teclado.nextDouble();
		System.out.print("C= ");
		x.c= teclado.nextDouble();
		pX = (x.a + x.b + x.c)/2;
		areaX = Math.sqrt(pX * (pX - x.a) * (pX - x.b) * (pX - x.c));
		
		System.out.println("\nInforme as medidas para o Tri�ngulo Y");
		System.out.print("A= ");
		y.a = teclado.nextDouble();
		System.out.print("B= ");
		y.b = teclado.nextDouble();
		System.out.print("C= ");
		y.c = teclado.nextDouble();
		pY = (y.a + y.b + y.c) / 2;
		areaY = Math.sqrt(pY * (pY - y.a) * (pY - y.b) * (pY - y.c));
		
		
		//System.out.printf("\n�rea do tri�ngulo X= %.4f \n", areaX);
		//System.out.printf("�rea do tri�ngulo Y= %.4f \n", areaY);
		
		//System.out.print("\nO triangulo com maior �rea � o Tri�ngulo");
		
		/*if(areaX > areaY) {
			System.out.print(" X \n");
		}else {
			System.out.print(" Y \n");
		}*/
		
		teclado.close();
	}

}
