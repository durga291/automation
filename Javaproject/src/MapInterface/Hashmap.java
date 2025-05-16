package MapInterface;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> s = new HashMap<Integer, String>();
		s.put(100, "nokia");
		s.put(101, "samsung");
		s.put(102, "vivo");
		s.put(103, "iphone");
		s.put(104, "realme");
		
		System.out.println(s);
		
		s.put(100, "oppo");
		
		System.out.println("after adding duplicates:"  +s);
		
		s.put(103, "iphone");
		
		System.out.println(s);
		
		s.put(105, null);
		System.out.println(s);//null values allowed
		
		s.put(106, null);
		System.out.println(s);//more than one null values allowed
		
		s.put(null, "samsung");
		System.out.println(s);//null as key allowed
		
		s.put(null, "samsung");
		s.put(null, "samsung");
		System.out.println(s); //only one time null key allowed
		
		System.out.println("All keys:" +s.keySet());
		
		System.out.println("All Values:" +s.values());
		
		System.out.println("particular value:" +s.get(102));
		
		System.out.println("check key:" +s.containsKey(101));
		
		System.out.println("check value:" +s.containsValue("realme"));
		
		
		
		

	}

}
