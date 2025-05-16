package SetInterface;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Object> s1=new TreeSet<>(); 
		s1.add("Java"); 
		//s1.add(123); //it will not allowed datatypes are int and character,it will get ClasscastException
		s1.add("selenium"); 
		//s1.add('a'); //treeset is homogeneous
		
		System.out.println("Treeset Objects are: "+s1); 
		
		//s1.add(null);//null objects not allowed will get null pointerexception
		
		//System.out.println(s1);
		
		s1.add("java");
		
		System.out.println("after adding duplicates:"  +s1);//duplicates allowed

		/*s1.pollFirst();// it extracting (removing) the first element
		
		System.out.println("poll first :"  +s1); 
		
		s1.pollLast(); //last object will remove
		
		System.out.println("after poll last:" +s1); //it extracting (removing) the last element*/
		
		s1.first();
		
		System.out.println("after the first :"  +s1.first()); //extracting first element 
		
		
		s1.last();
		
		System.out.println("after the last:"  +s1.last()); //extracting last element

	}

}
