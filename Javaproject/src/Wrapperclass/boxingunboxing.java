package Wrapperclass;

public class boxingunboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a =100; // primitive data type
		
		//Boxing can be performed by using valueOf() 
		
		Integer b = Integer.valueOf(a);
		
		System.out.println(b.toString());
		
		//unBoxing can be performed by using intvalue() 
		
		Integer i = new Integer(100);
		int c = i.intValue();
		
		System.out.println(c);
		
		
		

	}

}
