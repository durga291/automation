package objectcasting;

class Student    //super class
{
	void view()
	{
		System.out.println("student name = raj");
		System.out.println("student clg = abcd");
	}
}

class Admin extends Student     //Admin  ----> sub class
{
	void edit()
	{
		System.out.println("edit student name");
		System.out.println("edit student clg");
	}
}

public class upcasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student  sd = new Student(); //Student ---->compilation
		sd.view();                   //Admin ----->execution
		
		

	}

}
