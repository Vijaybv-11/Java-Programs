package ComputetheQuotientandRemainder;

import java.util.Scanner;

public class quotientremainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for a and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		int quot = a / b;
		int rem = a % b;
		System.out.println("Quotient : " + quot);
		System.out.println("Remainder : " + rem);

	}

}
