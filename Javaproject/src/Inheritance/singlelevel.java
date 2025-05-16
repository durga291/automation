package Inheritance;


class parent
{
	int a;
	void walk()
	{
		System.out.println(a);
	}
}

class child extends parent
{
	int b;
	void run()
	{
		System.out.println(b);
	}
}
public class singlelevel {

	public static void main(String[] args) {
		
		/* parent ab = new parent();
		ab.a =10;
		ab.walk();
		*/
		
		child df = new child();
		df.a=10;
		df.walk();
		
		df.b=20;
		df.run();
		

	}

}
