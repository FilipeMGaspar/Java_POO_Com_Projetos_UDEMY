package Programa;

import java.util.ArrayList;
import java.util.List;

public class Aula_95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList();;
		
		list.add("Ana");
		list.add("Manuel");
		list.add("Maria");
		list.add("Bob");
		
		//Inserir um elemento na posi��o 2 depois do manuel
		list.add(2,"Bernardo");
		list.add(3,"Ninita");
		
		for(String x : list) {
			System.out.println(x);
		}
		
		
	}

}
