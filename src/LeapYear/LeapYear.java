package LeapYear;

import java.util.Scanner;

public class LeapYear {
	
	public static void main(String[] args) {
		
		int year ;
		Scanner sc = new Scanner ( System .in ) ;
		System.out.println("Enter the year : ");
		year = sc . nextInt ( ) ;
		if(year%4 == 0 && year!=100 || year%400 == 0)
		System.out.println("It is a Leap year : " + year);
		else
		{
		System.out.println("It is not a Leap year :" + year);
		}
		}
	

}
