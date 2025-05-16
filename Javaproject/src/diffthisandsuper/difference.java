package diffthisandsuper;

class P
{
	String s ="parent variable";
}

class C extends P
{
	String s="child variable";
	
	void m1()
	{
		//System.out.println(s);
		//System.out.println(this.s); //while run using this it will print near to m1 method or class bcz of calling m1 in main method
		System.out.println(super.s);  //while run using this it will print any another class or nonstatic or instancemethod or class.
	}
}



public class difference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//C c =new C();
		//c.m1();
	}

}
