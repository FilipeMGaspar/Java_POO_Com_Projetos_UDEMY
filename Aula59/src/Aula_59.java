
public class Aula_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original = "abcde FGHIJ ABC abc DEFG";
		
	    String s01 = original.toLowerCase();
	    System.out.println("Original: \" " + original+" \"");
	    System.out.println("toLowerCase: \" " + s01+" \"");
	 
	    String s02 = original.toUpperCase();
	    System.out.println("toUpperCase: \" " + s02  +" \"");
	    
	    String s03 = original.trim();
	    System.out.println("trim: \" " + s03  +" \""); 
	}

}
