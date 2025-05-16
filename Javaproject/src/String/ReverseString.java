package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WAP to provide reverse of a string, actual string is "javadev"and reverse string is "vedavaj"
		
		String actual="javadev"; 
		String rev=""; 
		for(int i=actual.length()-1;i>=0;i--) 
		{ 
			rev=rev+actual.charAt(i); 
		} 
		System.out.println("reverse of a string is : "+rev);

	}

}
