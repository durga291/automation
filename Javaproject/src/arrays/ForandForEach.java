package arrays;

public class ForandForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,23,45,32,54,56};
		System.out.println("size of array:" +a.length);
		System.out.println("particular element:"  +a[2]);
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		for (int t:a)
		{
			System.out.println(t);
		}
	}

}
