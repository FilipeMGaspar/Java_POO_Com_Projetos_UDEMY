import java.util.Scanner;

public class Aula_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("6º bit é verdadeiro");
		}else {
			System.out.println("6º bit é falso");
		}
		
		sc.close();
	}

}
