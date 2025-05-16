package String;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to check a string palindrome or not
		
		String actual="madam";
		String rev="";
		for(int i=actual.length()-1;i>=0;i--)
		{
			rev=rev+actual.charAt(i);
		}
		
		if(actual.equals(rev))
		{
			System.out.println(actual  + " string is palindome");
		}
		else
		{
			System.out.println(actual  + " string is not a palindrome");
		}

	}

}
