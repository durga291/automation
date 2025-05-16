package String;

public class Stringbufferandbuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using string buffer and builder
		
		StringBuilder sb = new StringBuilder("java");
		System.out.println(sb.append("language"));
		
		//StringBuilder sb2 ="manual"; ...... we cant
		
		StringBuffer sb1=new StringBuffer("api");
		System.out.println(sb1.append("java"));
		
		//StringBuffer sb3 ="manual";......we cant
		
		//using equals and ==
		
		StringBuffer sb4 =new StringBuffer("manual");
		StringBuffer sb5 =new StringBuffer("manual");
		
		System.out.println(sb4.equals(sb5));
		System.out.println(sb4==sb5);
		

	}

}
