package Programa;

import java.util.ArrayList;
import java.util.List;

public class Aula_95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList();;
		
		list.add("Paulo");
		list.add("Ana");
		list.add("Manuel");
		list.add("Maria");
		list.add("Bob");
		
		//Inserir um elemento na posição 2 depois do manuel
		list.add(2,"Bernardo");
		list.add(4,"Ninita");//Inserir um elemto na posição 4
		
		//Tamanho da Lista
		System.out.println("Tamanho da lista: "+list.size());
		
		System.out.println("");
		

		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("----------------");
		list.remove("Ana"); //Remove pelo nome
		list.remove(1); //Remove pelo indice 
		list.removeIf(x -> x.charAt(0) == 'M'); //Remover pela primeira letra, por um predicado função lambda
		
		for(String x : list) {
			System.out.println(x);
		}
		
	}

}
