package Programa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Aula_95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList();;
		
		list.add("Paulo");
		list.add("Ana");
		list.add("Manuel");
		list.add("Maria");
		list.add("Bob");
		list.add("Paula");
		list.add("Aurora");
		
		//Inserir um elemento na posição 2 depois do manuel
		list.add(2,"Bernardo");
		list.add(4,"Ninita");//Inserir um elemto na posição 4
		
		//Tamanho da Lista
		System.out.println("Tamanho da lista: "+list.size());
		
		System.out.println("");
		

		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("\n----------------");
		//list.remove("Ana"); //Remove pelo nome
		//list.remove(1); //Remove pelo indice 
		list.removeIf(x -> x.charAt(0) == 'P'); //Remover pela primeira letra, por um predicado função lambda
		
		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("\n----------------");
		System.out.println("Localização do nome Bob: " + list.indexOf("Bob"));
		System.out.println("Localização do nome Rui: " + list.indexOf("Rui"));
		
		System.out.println("\n----------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		
		//Encontrar o primeiro elemento iniciado por A
		System.out.println("\n----------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println("Primeiro nome iniciado pela letra A: " + name);
		
		name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println("\nPrimeiro nome iniciado pela letra J: " + name);
		
	}

}
