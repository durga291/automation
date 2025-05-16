package Importantprograms;

public class Palindromenumber {

	public static void main(String[] args) {
		
       int num = 1221,rev=0,remainder;
		
		int temp=num;
		
		while(num>0)
		{
			remainder=num%10;
			num=num/10;
			rev=(rev*10)+remainder;
		}
		System.out.println("Reverse of num is:" +rev);
		if(temp==rev)
		{
			System.out.println("your number is palindrome number");
		}
		else
		{
			System.out.println("your number is not palindrome number");
		}

	}

}
