package String;

public class CountandPrintOvels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to count and print ovels
		
		String s="orange";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o' ||s.charAt(i)=='u')
			{
				System.out.println(s.charAt(i));
				count++;
			}

		}
		System.out.println("Count of vowels in smaller case is : "+count); 

	}

}
