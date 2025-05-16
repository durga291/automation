package Importantprograms;

public class FabonacciSeries {
	
	class fibonacci {
		
		// Function to find the fibonacci Series
		
	    public static int fib(int n)
	    {

	        // Declare an array to store Fibonacci numbers
	      
	        // 1 extra to handle case, n = 0
	    	
	        int a[] = new int[n + 2];

	        int i;

	        // 0th and 1st number of
	        // the series are 0 and 1
	        a[0] = 0;
	        a[1] = 1;

	        for (i = 2; i <= n; i++) {

	            // Add the previous 2 numbers
	            // in the series and store it
	            a[i] = a[i - 1] + a[i - 2];
	        }

	        // Nth Fibonacci Number
	        return a[n];
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Given Number N
        int N = 10;

        // Print first 10 term
        
        for (int i = 0; i < N; i++)
       
        fib();
        	
           

	}



	
}
