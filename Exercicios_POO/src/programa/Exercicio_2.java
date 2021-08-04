package programa;

import java.util.Scanner;

import entidades.Disciplina;

public class Exercicio_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Disciplina mat = new Disciplina();
		
		System.out.println(" ** Iniciar Disciplina ** \n");
		System.out.print(" -> Nome ..........: ");
		mat.setNome(teclado.nextLine());
		//teclado.nextLine();
		System.out.print(" -> Craga Horária .: ");
		mat.setCargaHoraria(teclado.nextInt());
		teclado.nextLine();
		System.out.print(" -> Código ........: ");
		mat.setCodigo(teclado.nextLine());
		
		System.out.println("\n");
		System.out.println(" ## Ficha da Disciplina  ##");
		System.out.println(" ..: Nome -----------> " + mat.getNome());
		System.out.println(" ..: Carga Horária --> " + mat.getCargaHoraria());
		System.out.println(" ..: Códigfo --------> " + mat.getCodigo());
		System.out.println();
		
		//System.out.println("\n\n"+ mat.toString());
		
		teclado.close();
	}

}
