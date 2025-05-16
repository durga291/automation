package ExceptionHandling;

public class throwthrows {
	
	static void checkage(int age) throws ArithmeticException
	{
		if(age<18)
		{
			throw new ArithmeticException("can't vote");
		}
		
		else
		{
			System.out.println("can vote");
		}
		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method
		
		
		try
		{
			checkage(14);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		
		System.out.println("last use");

		
		
	}

}
