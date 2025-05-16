package Importantprograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//wap to find factorial of any number
		
				//take input from user
				//create an instance of the scanner class
				
				Scanner sc = new Scanner(System.in);
				
				//declare and initialize the variable
				
			    System.out.println("enter the number");
				
				int a = sc.nextInt();
				
				//initialize the variable to 1
				
		        int fact =1;
		        
		        //use for loop to calculate the factorial
				
				for (int i=1;i<=a;i++)
				{
					//update the factorial variable by multipling it with the loop variable in each iteration
					
					fact = fact*i;
				}
				//print the factorial of number
				System.out.println("factorial of number is :"   +fact);


	}

}
