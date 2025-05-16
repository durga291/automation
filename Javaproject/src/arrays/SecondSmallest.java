package arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//wap to second smallest element from an array without sorting
		
				//input: 11 5 6 55 24 
				//output: 6


				int a[]= {11,5,6,55,24}; 
				
				int min=a[0],secmin=a[0]; 
				
				for(int i=0;i<a.length;i++) 
				{ 
					if(a[i]<min) 
					{ 
						secmin=min; 
						min=a[i]; 
					} 
					else if(a[i]<secmin) 
					{ 
						secmin=a[i]; 
					} 
				} 
				System.out.println("minimum value : "+min); 
				System.out.println("second minimum value : "+secmin); 

	}

}
