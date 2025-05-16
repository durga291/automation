package Importantprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 4; 
		boolean flag = true; 
		for(int i = 2; i < num; ++i) 
		{ 
		 // condition for nonprime number 
			if(num % i == 0) 
			{ 
				flag = false; 
				break; 
			} 
		} 
		
		if (flag==true) 
			System.out.println(num + " is a prime number. "); 
		else 
			System.out.println(num + " is not a prime number. ");

	}

}
