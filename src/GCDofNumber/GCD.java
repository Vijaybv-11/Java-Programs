package GCDofNumber;

import java.util.Scanner;

public class GCD {
	
	public static void main(String[] args) {
		
		int a , b ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		while(a != b)
		{
			if(a > b)
				a = a - b ;
				else
				b = b - a ;
				}
				System.out.println("GCD of given numbers is : " +b);
	}
	}
