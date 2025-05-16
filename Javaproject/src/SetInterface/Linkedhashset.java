package SetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Object> s1=new LinkedHashSet<>(); 
		s1.add("Rohan"); 
		s1.add("Riya"); 
		s1.add("Pooja"); 
		s1.add(445); 
		s1.add('A'); 
		System.out.println("Hash set objectss are: "+s1); 
		s1.add("Riya"); 
		s1.add(445); 
		System.out.println("After add duplicates: "+s1); 
		s1.add(null); 
		s1.add(null); 
		System.out.println("After adding null objects: "+s1); 
		System.out.println("-------Forward direction ---- "); 
		
		Iterator<Object> i1 = s1.iterator(); 
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}

	}

}
