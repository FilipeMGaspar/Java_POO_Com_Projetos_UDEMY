import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá Mundo!");
		System.out.println("Ufa! Estou livre da maldição.");
		System.out.println("Este é o meu primeiro programa em Java! \n");
		System.out.print("Olá Mundo!");
		System.out.print(" Bom Dia! \n");
		
		int y = 32;
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f \n", x);
		System.out.printf("%.4f \n", x);
		System.out.println("Bom dia!");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f \n", x);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("Resultado %.2f Metros \n\n", x);
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4201.135;
		
		System.out.printf("%s tem %d anos de idade e ganha R$ %.2f \n", nome, idade, renda );
	}

}
