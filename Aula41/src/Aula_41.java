
public class Aula_41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 400.00;
		double discount;
		
		if(price < 200.00) {
			discount = price * 0.1;
		}else {
			discount = 0.0;
		}
		
		System.out.println(discount);
	}

}
