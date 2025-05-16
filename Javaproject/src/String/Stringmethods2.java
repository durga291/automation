package String;

public class Stringmethods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//concept of substring -- it deletes before some part of string --starts with 0
		
		/*String s1 ="java development";
		System.out.println(s1.substring(1)); //before index 1 part should be deleted.starts with 0.....j=0,a=1,so before 'a' part deleted.
		
		//using begining and ending index
		
		System.out.println(s1.substring(1, 9)); //--begining index upto 1 part deleted i.e.,j deleted and ending index after 9 part deleted
												//lopment deleted.
		
		//starts with  string prefix return type boolean 
		
		System.out.println(s1.startsWith("java")); //java is there so it returns true
		
		//end with string suffix
		
		System.out.println(s1.endsWith("ment"));
		
		//using contains ---- given word having that character or not....return type boolean
		
		System.out.println(s1.contains("m"));*/
		
		//using is blank and is empty
		
		String s2 =" ";
		System.out.println(s2.isBlank()); //-- each blank counts charater
		System.out.println(s2.isEmpty()); 
		
		

	}

}
