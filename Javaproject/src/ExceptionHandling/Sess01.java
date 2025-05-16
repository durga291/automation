package ExceptionHandling;

public class Sess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int a=1000/0;
		}
		catch (ArithmeticException e) 
		{
			// TODO: handle exception
			
			System.out.println("exception is handling" +e.toString());
		}
		
		//System.out.println("welcome to java");
		
		//in this scenario only int variable and syso are there, we will get error as arithematic exception,
		//but we wan to run this by using try catch block
		
		

	}

}
