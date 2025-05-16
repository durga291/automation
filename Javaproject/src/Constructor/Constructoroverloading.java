package Constructor;

public class Constructoroverloading {
	
	Constructoroverloading(int a, int b) 
	{
		System.out.println(a+b);
		
	}
	
	Constructoroverloading(double a, int b) 
	{
		System.out.println(a+b);
		
	}
	
	Constructoroverloading(double a, double b) 
	{
		System.out.println(a+b);
		
	}
	
	Constructoroverloading(int a, int b,int c) 
	{
		System.out.println(a+b+c);
		
	}

	public static void main(String[] args) {

		Constructoroverloading CO = new Constructoroverloading(22, 12, 15);

	}

}
