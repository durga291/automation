package arrays;

//Passing an array as an argument to a method 

public class PassingArrayas 
{
	
	
	String name;int age;float per; 
	
	public PassingArrayas(String name,int age,float per) 
	{ 
	this.name=name; 
	this.age=age; 
	this.per=per;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PassingArrayas std[]=new PassingArrayas[3];  //i created a primenumbers array 
		std[0]=new PassingArrayas("Ravi",27,81.2f); 
		std[1]=new PassingArrayas("Rohan",23,77.5f); 
		std[2]=new PassingArrayas("Riya",21,77.9f); 
		details(std);//call details method and pass array as arguments
		
}
	public static void details(PassingArrayas sarray[]) 
	//Students sarray[]=new Students[3] 
	{ 
		System.out.println("Name Age percentage"); 
		for(PassingArrayas s1:sarray) 
		{ 
			System.out.println(s1.name+" "+s1.age+" "+s1.per); 
		}
	}

}
