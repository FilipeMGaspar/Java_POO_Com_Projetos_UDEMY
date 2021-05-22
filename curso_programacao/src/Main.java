import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.print("Olá Mundo!");
		//System.out.println("Ufa! Estou livre da maldição.");
		//System.out.println("Este é o meu primeiro programa em Java!");
		//System.out.print(" Bom Dia!");
		
		//int y = 32;
		double x = 10.35784;
		
		//System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f \n", x);
		System.out.printf("%.4f \n", x);
		//System.out.println("Bom dia!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f \n", x);
	}

}
