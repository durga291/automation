package arrays;

public class ForandForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[5]; //
		
		a[0]=12;
		a[1]=19;
		a[2]=24;
		a[3]=5;
		a[4]=34;
		
		System.out.println("size of array :"  +a.length);
		System.out.println("particular element:"  +a[2]);
		
		/*for (int i=0;i<a.length;i++)  //for loop ----total element print used this one
		{
			System.out.println(a[i]);
		}
		*/
		
		for (int w :a) // for each loop ----- only 6 out of 10 used this one
		{
			System.out.println(w);
		}
	}

}
