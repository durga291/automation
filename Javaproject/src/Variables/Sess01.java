package Variables;

public class Sess01 {
	
	
	int rollno;    //global variable --nonstatic(instance)
	String name;
	
	static String collagename ="BEC"; //global variable--static

	
	
	public static void main(String[] args) {
	
		Sess01 ab = new Sess01();
		ab.rollno =21;
		ab.name ="Ram";
		
		System.out.println(ab.name +"  " + ab.rollno+ " " +ab.collagename);
		
		
		Sess01 db = new Sess01();
		db.rollno =25;
		db.name ="Raj";
		
		System.out.println(db.name +"  " + db.rollno+ " "  +db.collagename);
		
		
	}

}
