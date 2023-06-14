package Checkifnumberisoddoreven;

import java.util.Scanner;

public class Oddeven {

	public static void main(String[]args)
		{
		int n ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc . nextInt();
		if(n%2==0)
		{
		System.out.println("It is an even number : " +n);
		}
		else
		{
		System.out.println("It is an odd number : " +n);
		}
		
		}	
}
