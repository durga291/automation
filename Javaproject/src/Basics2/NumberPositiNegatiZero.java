package Basics2;

import java.util.Scanner;

public class NumberPositiNegatiZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to check a number is positive , negative or zero , number is user defined
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		
		int a= sc.nextInt();
		
		if(a>0)
		{
			System.out.println("number is positive");
		}
		else if(a<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("number is zero");
		}

	}

}
