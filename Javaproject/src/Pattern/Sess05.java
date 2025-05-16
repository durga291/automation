package Pattern;

public class Sess05 {

	public static void main(String[] args) {
		
		// *#*#  
		 //*#*#  
		 //*#*#  
		 //*#*#  
		
		for(int i=1;i<=4;i++) //outer loop for no.of rows
		{
			for(int j=1;j<=4;j++) //inner loop for no.of columns
			{
				if(j%2==0)
				{
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println("");
		}

	}

}
