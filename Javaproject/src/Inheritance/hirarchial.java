package Inheritance;

class rbi
{
	double a;
	void rent()
	{
		System.out.println(a);
	}
}

class sbi extends rbi
{
	double b;
	void debt()
	{
		System.out.println(b);
	}
}

class axis extends rbi
{
	double c;
	void divide()
	{
		System.out.println(c);
	}
}

public class hirarchial {

	public static void main(String[] args) {
		
		sbi sb = new sbi();
		sb.a =10.56;
		sb.rent();
		
		sb.b=20.54;
		sb.debt();
		
		/*axis ax = new axis();
		ax.a =15.2;
		ax.rent();
		
		ax.c=13.4;
		ax.divide();*/

	}

}
