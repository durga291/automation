package arrays;

import java.util.Scanner;

public class LargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to take input from user and find largest element from an array
		
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("eneter size of an array:");
		 int size = sc.nextInt();
		 
		System.out.println("enter the data:");
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
						//[4,5,6]
		
		int max =a[0];
		
		//checking condition for maximum element
		
		for(int j=0;j<a.length;j++)
		{
			if(a[j]>max)
			{
				max=a[j];
			}
		}
		
		System.out.println("largest element from an array:" +max);

	}

}
