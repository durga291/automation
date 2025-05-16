package QueueInterface;

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("java"); 
		pq.add("html"); 
		pq.add("css"); 
		pq.add("soap");  
		pq.add("slenium");
		
		//pq.add(null); // we will get null pointer exception
		
		pq.add("null");//here null as a string
		pq.add("java"); // duplicates allowed
		
		System.out.println(pq); // we will get sorting order output
		
		
		
		System.out.println(pq.peek());
		
		System.out.println("after peek : " +pq); //It retrieves head element(First element) and delete it from queue
												//It returns null, if there is no head element present. 
		
		System.out.println(pq.poll());
		
		System.out.println("after poll : " +pq); //It retrieves head element(First element) and delete it from queue
		
		
	}

}
