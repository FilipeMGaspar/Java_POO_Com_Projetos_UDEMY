
public class aula28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.0;
		double y = 4.0;
		double z = -5.0;
		double A, B, C;
		
		A = Math.sqrt(x);
		B = Math.sqrt(y);
		C = Math.sqrt(25.0);
		System.out.println("Raiz quadrada de " + x + " = "+ A);
		System.out.println("Raiz quadrada de " + y + " = "+ B);
		System.out.println("Raiz quadrada de 25" + x + " = "+ C);
	
		A = Math.pow(x, y);
		B = Math.pow(x, 2.0);
		C = Math.pow(5.0, 2.0);
		
		System.out.println(x + " elevado a " + y + " = " + A);
		System.out.println(x + " elevado a " + y + " = " + A);
	}

}
