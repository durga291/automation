package Pattern;

public class Sess09 {

	public static void main(String[] args) {
		
		
		//  *
		// **
		//***
		
		for (int i=1;i<=3;i++) //outer loop for no.of rows
		{
			for(int j=4;j>=1;j--) //inner loop for no.of columns
			{
				if(i>=j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
