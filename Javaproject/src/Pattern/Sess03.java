package Pattern;

public class Sess03 {

	public static void main(String[] args) {
	
		//****
		//**
		//****
		//****
		
		for(int i=1;i<=4;i++) //outer loop for no.of rows
		{
			for(int j=1;j<=4;j++) //inner loop for no.of columns
			{
				if(i==2 && j>=3)
				{
					System.out.print("");
				}
				else
				{
					System.out.print("*");
				}
				
			}
			
			System.out.println("");
		}

	}


	}
