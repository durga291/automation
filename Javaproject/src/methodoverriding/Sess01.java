package methodoverriding;

 	class Rbi
 	{
 		double getInterest()
 		{
 			return 0.0;
 		}
 	}
 	
 	class Axis extends Rbi
 	{
 		double getInterest()
 		{
 			return 4.0;
 		}
 	}
 	
 	class Sbi extends Rbi
 	{
 		double getInterest()
 		{
 			return 5.6;
 		}
 	}


public class Sess01 {

	public static void main(String[] args) {
		
		Rbi rb = new Rbi();
		
		rb.getInterest();
		System.out.println(rb.getInterest());
		
		Sbi sb = new Sbi();
		System.out.println(sb.getInterest());
		
		Axis ax = new Axis();
		System.out.println(ax.getInterest());

	}

}
