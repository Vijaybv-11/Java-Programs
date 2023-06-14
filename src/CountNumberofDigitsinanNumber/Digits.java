package CountNumberofDigitsinanNumber;

import java.util.Scanner;

public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
			
			int n ;
			Scanner sc = new Scanner ( System .in ) ;
			System.out.println("Enter the number : ");
			n = sc . nextInt ( ) ;
			int count=0;
			while(n!=0)
			{
			n=n/10;
			count++;
			}
			System.out.println("count of a number : " +count);

	}

}
