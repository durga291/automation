package Importantprograms;

public class SeconLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to second largest element from an array without sorting
		
		//input: 11 22 33 44 55 
		//output: 44


		int a[]= {11,22,33,44,55}; 
		
		int max=a[0],secmax=a[0]; 
		
		for(int i=0;i<a.length;i++) 
		{ 
			if(a[i]>max) 
			{ 
				secmax=max; 
				max=a[i]; 
			} 
			else if(a[i]>secmax) 
			{ 
				secmax=a[i]; 
			} 
		} 
		System.out.println("maximum value : "+max); 
		System.out.println("second maximum value : "+secmax); 

	}

}
