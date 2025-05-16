package Importantprograms;

import java.util.Scanner;

public class EvenOddNumberusingScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even number");
        else
            System.out.println(num + " is odd number");

	}

}
