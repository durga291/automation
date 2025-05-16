package Basics2;

public class Factorial5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to the value of factorial 5 --->5*4*3*2*1
		
		int fact =1;
		
		for (int i=5;i>=1;i--)
		{
			fact = fact*i;
		}
		System.out.println("factorial of 5 is :"   +fact);
		

	}

}
