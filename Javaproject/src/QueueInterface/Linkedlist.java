package QueueInterface;

import java.util.LinkedList;
import java.util.Queue;

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Object> q1=new LinkedList<>(); 
		q1.add("java"); 
		q1.add("api"); 
		q1.add("Selenium"); 
		q1.add("manual");
		
		System.out.println(q1);
		
		while(q1.peek()!=null)
		{
			System.out.println(q1.poll());
		}

	}

}
