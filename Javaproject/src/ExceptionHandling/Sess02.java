package ExceptionHandling;

public class Sess02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = new int[4];
		
		try {
		a[0]=12;  //without exception try and finally block running
		a[1]=5;  //with exception try,catch finally block are running
		a[2]=53;
		a[3]=45;
		a[4]=34;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("exception is handling" +e.toString());
		}
		
		finally {
			System.out.println("used finally block");
		}
		
		System.out.println("hello");
		

	}

}
