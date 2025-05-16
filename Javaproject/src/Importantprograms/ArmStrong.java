package Importantprograms;

public class ArmStrong {

	public static void main(String[] args) {
		
		
        int num = 153,rev=0,remainder;
		
		int temp=num;
		
		while(num>0)
		{
			remainder=num%10;
			num=num/10;
			rev=rev+(remainder*remainder*remainder);
		}
		System.out.println("Reverse of num is:" +rev);
		
		if(temp==rev)
		{
			System.out.println("your number is armstrong number");
		}
		else
		{
			System.out.println("your number is not armstrong number");
		}

	}

}
