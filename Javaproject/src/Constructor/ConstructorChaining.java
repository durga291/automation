package Constructor;

public class ConstructorChaining {
	
	ConstructorChaining()
	{
		this(100, 130);//this keyword should used first in line
		System.out.println("this is default constructor");
	}
	
	ConstructorChaining(int a, int b)
	{
		System.out.println("add of two values:" +(a+b));
		System.out.println("this is parameterised constructor");
	}

	public static void main(String[] args) {


	ConstructorChaining cc = new ConstructorChaining();

	}

}
