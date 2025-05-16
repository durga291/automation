package arrays;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to take array from users and find reverse of an array
		
		Scanner sc = new Scanner(System.in); //create object for scanner class
		System.out.println("enter the size of an array:");
		
		int size =sc.nextInt(); //nextint method is used to take the next integers from array
		
		int a[]=new int[size]; //  [1,2,3,4]
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt(); 
		}  
		for(int j=a.length-1;j>=0;j--)
		{
			System.out.println("a["+j+"]="  +a[j]); //[4],[3],[2],[1]
		}

	}

}
