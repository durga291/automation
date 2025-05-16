package Basics2;

import java.util.Scanner;

public class Age18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to check a person can vote if age is >18 or <18 or =18
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age");
		
		int a = sc.nextInt();
		
		if(a>18)
		{
			System.out.println("can vote");
			
		}
		else if (a<18)
		{
			System.out.println("can't determind");
		}
		else
		{
			System.out.println("can't vote");
		}

	}

}
