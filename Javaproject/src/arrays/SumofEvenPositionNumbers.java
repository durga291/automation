package arrays;

import java.util.Scanner;

public class SumofEvenPositionNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to take array from users and find sum of even position of an array
		
				Scanner sc = new Scanner(System.in); //create object for scanner class
				System.out.println("enter the size of an array:");
				
				int size =sc.nextInt(); //nextint method is used to take the next integers from array
				
				int a[]=new int[size]; //  [1,2,3,4]
				
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt(); 
				}  
				int sum =0;
				
				for(int j=0;j<a.length;j++)
				{
					if(j%2==0)
					    sum=sum+a[j];
				}
				System.out.println("sum of even position of an array:" +sum);
				
				
	}

}
