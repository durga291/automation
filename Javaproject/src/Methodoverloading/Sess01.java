package Methodoverloading;

public class Sess01 {
	
		void add(int a,int b)
		{
			System.out.println(a+b);
		}
		
		void add(double a,int b)
		{
			System.out.println(a+b);
		}
		
		void add(double b,double a)
		{
			System.out.println(a+b);
		}
		
		void add(int a,int b,int c)
		{
			System.out.println(a+b+c);
		}
	public static void main(String[] args) {
	
		Sess01 ab = new Sess01();
		ab.add(10.5, 5);
		ab.add(15, 10, 5);

	}

}
