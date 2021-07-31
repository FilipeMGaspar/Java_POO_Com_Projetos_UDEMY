package program;

import entidade.ContaNoBanco;

public class Aula82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaNoBanco NBalfredo = new ContaNoBanco(1011, "Alfredo");
		System.out.println(NBalfredo.toString());
		
		NBalfredo.setNumConta(200152); //Não será possivel de realizar
	}

}
