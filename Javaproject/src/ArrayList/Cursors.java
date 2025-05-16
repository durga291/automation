package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//cursor
				//1.iterator 2.List iterator
			
		ArrayList a = new ArrayList(); //in which you are given data it will store that data ---stores heterogenous data
		a.add("java");
		a.add(123);
		a.add('A');
		a.add(34.52f);
		
		System.out.println(a);
		
		// using Iterator
		
		for (Object x :a)
		 {
			 System.out.println(x);
		 }
		
		System.out.println("forword direction :");
		 
		Iterator<Object> it = a.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
			 
		 }
		 System.out.println("forword direction :");
		 
		 //using List iterator
		 
		 ListIterator<Integer> li = a.listIterator();
		 
		 while (li.hasNext())
		 {
			 System.out.println(li.next());
		 }
		
		 
		 while(li.hasNext())
		 {
			 System.out.println(li.next());
		 }
		 
		 
		 System.out.println("backword direction:");
		 
		 while(li.hasPrevious())
		 {
			 System.out.println(li.previous());
		 }
		 
		
		
		
	}
				
				
				

}
