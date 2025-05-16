package Encapsulation;

class Employee
{
	private int Ramid;
	
	 void setRamid(int eid)
	 {
		 Ramid = eid;
	 }
	 
	 int getRamid()
	 {
		 return Ramid;
	 }
		
}

public class Sess01 {

	public static void main(String[] args) 
	{
		Employee ep=new Employee();
		ep.setRamid(200);
		System.out.println(ep.getRamid());

	}

}
