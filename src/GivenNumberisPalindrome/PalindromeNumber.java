package GivenNumberisPalindrome;

import java.util.Scanner;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		
		int n ;
		Scanner sc = new Scanner ( System .in ) ;
		System.out.println("Enter the number : ");
		n = sc . nextInt ( ) ;
		int rev=0;
		int copy=n;
		while(n!=0)
		{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		if(copy==rev)
		{
		System.out.println("palindrome number is : " +copy);
		}
		else
		{
		System.out.println("Number is not a palindrome : " +copy);
		}
		}
	

}
