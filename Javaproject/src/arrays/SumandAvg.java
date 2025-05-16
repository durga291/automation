package arrays;

import java.util.Scanner;

public class SumandAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to take array from users and find sum and avg
		
		Scanner sc = new Scanner(System.in); //create object for scanner class
		System.out.println("enter the size of an array:");
		
		int size =sc.nextInt(); //nextint method is used to take the next integers from array
		
		int a[]=new int[size]; //  [1,2,3,4]
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt(); 
		}                                  //[1,2]
		
		int sum =0;
		for(int j=0;j<a.length;j++)
		{
			sum=sum+a[j];  
			               //sum =sum+a[1]
			               //sum =1 +2
		}
		System.out.println("sum:"  +sum);  //3
		 float avg=sum/a.length;
		 System.out.println("average of an array" +avg);
		
		
		
		

	}

}
