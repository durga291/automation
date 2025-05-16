package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> a =new  ArrayList<Integer> ();
		a.add(12);
		a.add(3);
		a.add(43);
		a.add(13);
		System.out.println(a);
		
		System.out.println("Sorting :");
		
		Collections.sort(a);
		System.out.println(a);
		
		System.out.println("reverse order :");
		
		Collections.reverse(a);
		
		System.out.println(a);

	}

}
