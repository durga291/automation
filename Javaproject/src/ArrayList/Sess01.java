package ArrayList;

import java.util.ArrayList;

public class Sess01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList(); //in which you are given data it will store that data ---stores heterogenous data
		a.add("java");
		a.add(123);
		a.add('A');
		a.add(34.52f);
		
		System.out.println(a);
		
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(123);
		//a1.add("java"); // cant store bcz of  data type Integer
		
		a.add("java");
		System.out.println("after add duplicate:"+a);
		
		a.add(null);//after adding null string
		System.out.println("after adding null as string:" +a);
		
		a.add(null);
		System.out.println("after adding null as a object:" +a);
		
		a.add(null);
		System.out.println("after adding null as duplicate:" +a);
		
		a.remove(1);//123 data removed bcz of index 1
		System.out.println("after remove method:"  +a);
		
	}

}
