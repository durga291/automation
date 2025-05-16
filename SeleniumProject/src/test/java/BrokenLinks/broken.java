package BrokenLinks;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class broken {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  URL url = new URL("https://www.rediff.com/"); 
		  HttpURLConnection con = (HttpURLConnection) url.openConnection(); 
		   
		  int code = con.getResponseCode(); //if code is 200, then link is not broken 
		  System.out.println(code); 
		   
		  String msg = con.getResponseMessage(); //if msg is Ok, then link is not broken 
		  System.out.println(msg);

	}

}
