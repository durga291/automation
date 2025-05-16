package String;

public class usingChartAtmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to count e/E of a string ="javaEEdeve" //charat method is used to transfer string in character
		
		String s ="javaEEdeve";
		int count =0;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='e'||s.charAt(i)=='E')  //here OR operation used anyone true its true....first check with j with e or E false
													//means move to next upto E with e or E return true. so loop exists and print 4
													//index starts with zero so E character index is 4.
			{
				count++;
			}
		}
		System.out.println("count:" +count);

	}

}
