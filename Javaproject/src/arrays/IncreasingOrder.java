package arrays;

import java.util.Scanner;

public class IncreasingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to sort(arrange) the elements of array in increasing order.
		//input: 22 5 6 88 9 
		//output: 5 6 9 22 88
		
				Scanner sc = new Scanner(System.in); //create object for scanner class
				System.out.println("enter the size of an array:");
				
				int size =sc.nextInt(); //nextint method is used to take the next integers from array
				
				int a[]=new int[size]; //  [1,2,3,4]
				
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt(); 
				}  
				//for comparing and swapping 
				int temp; 
				for(int j=0;j<a.length;j++) 
				{ 
					for(int k=0;k<a.length-1;k++) 
					{ 
						if(a[k]>a[k+1]) 
						{ 
							temp=a[k]; 
							a[k]=a[k+1]; 
							a[k+1]=temp; 
						} 
					}	
				} 
				//for printing sorted array
				for(int m=0;m<a.length;m++)
				{
					System.out.println("a["+m+"]" +a[m]);
				}

	}

}
