package arrays;

import java.util.Scanner;

public class FirstandLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to take an array from users and print first and last element of an array
		
				Scanner sc = new Scanner(System.in); //create object for scanner class
				System.out.println("enter the size of an array:");
				
				int size =sc.nextInt(); //nextint method is used to take the next integers from array
				
				int a[]=new int[size]; // [1,2,3-----10] if take total length 10 index 9  [1,2,3,4]
				
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt(); 
					
					System.out.println(a[0]);
					System.out.println(a.length-1);
				}

	}

}
