package Constructor;

public class Rule1 {
	
	// Constructor and class name should be same
	
	int x;
	
	Rule1()   //default or non parameterised
	{
		x=10;
	}

	public static void main(String[] args) {

		Rule1 rs= new Rule1();
		System.out.println(rs.x);

	}

}
