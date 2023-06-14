package PowerOFNumber;

import java.util.Scanner;

public class Power {
	
	public static void main(String[] args) {
		
		
		int n , p ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		System.out.println("Enter the power : ");
		p = sc.nextInt();
		double result = Math.pow(n, p);
		System.out.println("Power of Number is : " +result );
	}
}

