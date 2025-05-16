package Constructor;

public class Rule2345 {
	
	
	//constructor does not have return type & Void keyword,if we add before declaring contructor(Rule2) 
	//as final or static or nonstatic or abstract if shows error
	
	String car;
	int year;
	
	Rule2345(String carname,int yearname) //parameterised
	{
		
		car = carname;
		year = yearname;
	}

	public static void main(String[] args) {
		
		Rule2345 Ru = new Rule2345("BMW", 2020);
		
		System.out.println(Ru.car +"  " + Ru.year);

	}

}
