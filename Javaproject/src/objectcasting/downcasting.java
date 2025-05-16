package objectcasting;

	class Student01   //super class
	{
		void view()
		{
			System.out.println("student name = raj");
			System.out.println("student clg = abcd");
		}
	}
	
	class Admin01 extends Student     //Admin  ----> sub class
	{
		void edit()
		{
			System.out.println("edit student name");
			System.out.println("edit student clg");
		}
	}

public class downcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Student01 sd1 = new  Admin01();
		
		/*Admin01 am = new Admin01();  
		am.edit();
		am.view();*/
		
		
		Admin01 a = new Admin01();
		a.edit();
		a.view();
		
		
		
		

	}

}
