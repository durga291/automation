package Constructor;

class A
{
	A(int i)
	{
		System.out.println("A is a default constructor");
	}
	
}

class B extends A
{
	B()
	{
		super(10);
		System.out.println("B is another default constructor");
	}
}

public class calltosuper {

	public static void main(String[] args) {
		
		
		B b1=new B();
	}

}
