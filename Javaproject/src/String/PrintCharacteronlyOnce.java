package String;

public class PrintCharacteronlyOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//WAP to print the character only once from string
		
		String str ="javajavajavadevdevdev";
		System.out.println("length of str:" + str.length());//21
		String un="";
		
		for(int i=0;i<str.length();i++) //21
		{
			char ch = str.charAt(i);
			
			//j
			
			if(un.indexOf(ch)==-1)//indexOf used to give index value of string and returns -1 if character or string not present
				
								//variable is already present if you are using -1 then it will not move
			{
				un=un+ch; //0+j --1st iteration
				//store j
						//Ja--2nd--strore ja
						//jav--3rd---store jav
						//java--4th--store java
						//next it will not move bcz of -1,after some different word is there it will move
						//javd--5th--strore javd
						//javde--6th--store javde


			}
		}
		
		System.out.println("Unique string is:"   + un);

	}

}
