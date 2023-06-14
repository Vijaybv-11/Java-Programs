package Sumofdigitsofagivennumber;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n ;
		Scanner sc = new Scanner ( System .in ) ;
		System.out.println("Enter the number : ");
		n = sc . nextInt ( ) ;
		int sum=0;
		while(n!=0) {
		int rem = n % 10 ;
		sum = sum + rem ;
		n = n / 10;
		}
		System.out.println("Sum of a number : " +sum);
	}

}
