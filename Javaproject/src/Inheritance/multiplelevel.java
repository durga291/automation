package Inheritance;

class gparent
{
	int a;
	
	void walk()
	{
		System.out.println(a);
	}
}

class parent01 extends gparent
{
	int b;
	
	void run()
	{
		System.out.println(b);
	}
}

class gchild extends parent01
{
	int c;
	
	void drive()
	{
		System.out.println(c);
	}
}
public class multiplelevel {

	public static void main(String[] args) {
		
		
		gchild gc = new gchild();
		gc.a=10;
		gc.walk();
		
		gc.b=20;
		gc.run();
		
		gc.c=30;
		gc.drive();

	}

}
