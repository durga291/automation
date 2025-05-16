package Importantprograms;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// WAP to provide reverse of a string, actual string is "javadev"and reverse string is "vedavaj"
		
		String actual="javadev"; 
		String rev=""; 
		
		// Traverse the original string from end to begining which means 
		// We start the loop from actual.length() - 1 (last index) and decrement i until it reaches 0.
		                                                          
		
		for(int i=actual.length()-1;i>=0;i--) 
		{ 
			rev=rev+actual.charAt(i); //Append each character to rev which means 
									  //Inside the loop, we append each character of actual to rev in reverse order using str.charAt(i).
																													
		} 
		System.out.println("reverse of a string is : "+rev);

	}

}
