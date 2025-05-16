package String;

public class Stringmethods1 {
	
	public static void main(String[] args) {
		
		// by using new keyword
		
		String s = new String("java");
		
		//by using literals
		
		String s1 ="java";
		
		//methods of string
		
		String s2="api";
		String s3 ="manual";
		String s4 ="12345";
		
		//combining of two strings
		System.out.println(s2.concat(s3));
		System.out.println(s3.concat(s4));
		
		//length of string
		
		System.out.println(s3.length());
		
		String s5 ="java";
		System.out.println(s5.length());
		
		//position of character using index starts with 0
		
		System.out.println(s5.charAt(3));
		
		//uppercase and lower case
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		//using trim method---trim the spaces before and after
		String s6 = " language ";
		System.out.println("before trim method :"   +s6);
		System.out.println("after trim method:" +s6.trim() );
		
		
	}
	

}
