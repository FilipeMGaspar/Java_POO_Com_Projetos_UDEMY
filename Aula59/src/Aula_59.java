
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
	    
	    String s04 = original.substring(2);
	    System.out.println("substring: \" " + s04  +" \"");
	    
	    String s05 = original.substring(2, 9);
	    System.out.println("substring(2, 9): \" " + s05  +" \"");
	   
	    String s06 = original.replace('a', 'x');
	    System.out.println("replace('a', 'x'): \" " + s06  +" \"");
	    
	    String s07 = original.replace("abc", "xy");
	    System.out.println("replace(\"abc\", \"xy\"): \" " + s07  +" \"");
	    
	    int i = original.indexOf("bc");
	    System.out.println("indexOf(\"bc\"): " + i  +" ");
	    
	    int j = original.lastIndexOf("bc");
	    System.out.println("lastIndexOf(\"bc\"): " + j  +" ");
	    
	    
	}

}
