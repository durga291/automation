package Importantprograms;

class Parents
{
	public void car()
	{
		System.out.println("Black colour");
	}
	
	public void carname() 
	{
		System.out.println("Audi");
	}
}

class Son extends Parents 
{
	public void car()
	{
		System.out.println("Blue colour");
	}
	
	public void carname() 
	{
		System.out.println("Nano");
	}
}

class Daughter extends Parents
{
	public void car()
	{
		System.out.println("Pink colour");
	}
	
	public void carname() 
	{
		System.out.println("Benz");
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Parents pr =new Parents();
		pr.car();
		pr.carname();
		
		Son sn = new Son();
		sn.car();
		sn.carname();
		
		Daughter dg = new Daughter();
		dg.car();
		dg.carname();
	}

}
