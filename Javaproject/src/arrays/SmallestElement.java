package arrays;

import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 // WAP to take input from user to find smallest number from an array
		
		Scanner sc = new Scanner(System.in); //create object for scanner class
		System.out.println("enter the size of an array:");
		
		int size =sc.nextInt(); //nextint method is used to take the next integers from array
		System.out.println("enter the data:");
		
		int a[]=new int[size]; //  [1,2,3,4]
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt(); 
		}                                  //[1,2]
		
		int min=a[0];
		for(int j=0;j<a.length;j++)
		{
			if(a[j]<min)
			{
				min=a[j];
			}
		}
		System.out.println("smallest number in an array:" +min);

	}

}
