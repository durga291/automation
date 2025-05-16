package Importantprograms;

import java.util.Scanner;									
public class PrimeNumbersuingScanner {

	public static void main(String[] args) 								//Algorithm:
	{
		// TODO Auto-generated method stub								//1.Start
		
		   //Take input from the user									//2.Create an instance of the Scanner class.
	       //Create instance of the Scanner class						//3.Declare a variable.
							
		   Scanner sc = new Scanner(System.in);  						//4.Ask the user to initialize the variable.			
	       System.out.println("Enter a number : ");  					//5.Call a method that will check whether the entered number is prime or not.
	       int num = sc.nextInt();  									//6.If the number is 0 or 1, print it is not a prime number.
	       
	       if (checkPrime(num)) 										//7.If the number is other than 0 and 1, then run a for loop from 2 
	    	   															//to the square root of that number.
	       {  
	           System.out.println(num + " is a prime number");  		//8.If the number is divisible by any of the numbers in that loop, 
	           															//then print it as not a prime number.
	       }
	       else 														//9.If the number is not divisible by any of the numbers in that loop, 
	    	   															//then print it as a prime number.
	       {  
	           System.out.println(num + " is not a prime number");		//10.Stop.
   
	       }  
	   }  
	   public static boolean checkPrime(int num) 
	   {  
	       if (num <=1) 
	       {  
	           return false;
	       }  																	//not getting coreect answer from 1 to 10,after getting correct 
           																		// not reccomended for scanner class
	       for (int i = 2; i <Math.sqrt(num); i++) 
	       {  
	           if (num % i == 0) 
	           {  
	               return false;
	           }  
	       }  
	       return true;  

	}

}
