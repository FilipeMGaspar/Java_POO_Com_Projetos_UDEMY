package programa;

public class Aula_93 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("---------------------------");
		
		for (String obj : vect) { // La?o for each 
			System.out.println(obj);
		}
	}

}
