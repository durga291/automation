package SetInterface;

import java.util.Collections;
import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet s1=new HashSet(); 
		s1.add("java"); 
		s1.add(1223); 
		s1.add("selenium"); 
		s1.add(88.9); 
		s1.add(1);
		
		//Collections.sort(s1); // we cant do sorting order will get cte
		
		System.out.println(s1); //insertion order is based on hashcode 
		
		s1.add(null);
		
		System.out.println(s1); // null objects allowed
		
		s1.add("java");
		
		System.out.println(s1); //duplicates doesnt allowed
		
		

	}

}
