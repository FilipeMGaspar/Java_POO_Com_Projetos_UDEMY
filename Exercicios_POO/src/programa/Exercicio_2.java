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
		System.out.print(" -> Craga Hor�ria .: ");
		mat.setCargaHoraria(teclado.nextInt());
		teclado.nextLine();
		System.out.print(" -> C�digo ........: ");
		mat.setCodigo(teclado.nextLine());
		
		System.out.println("\n");
		System.out.println(" ## Ficha da Disciplina  ##");
		System.out.println(" ..: Nome -----------> " + mat.getNome());
		System.out.println(" ..: Carga Hor�ria --> " + mat.getCargaHoraria());
		System.out.println(" ..: C�digfo --------> " + mat.getCodigo());
		System.out.println();
		
		//System.out.println("\n\n"+ mat.toString());
		
		teclado.close();
	}

}
