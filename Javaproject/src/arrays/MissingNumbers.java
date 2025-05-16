package arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//wap to find all missing numbers from 1 to 100from an array {11,22,33,44,55,66,77,88,99}
		
		boolean status=true; 
		
		int a[]= {11,22,33,44,55,66,77,88,99};
		
		for(int j=1;j<=100;j++) 
		{ 
			for(int i=0;i<a.length;i++) 
			{ 
				if(j==a[i]) 
				{ 
					status=false; 
					break; 
				} 
			} 
			if(status==true)//number is not present 
			{ 
				System.out.println("a["+j+"],"); 
			} 
			status=true;//for every number status should be true

		}

}
	
}
