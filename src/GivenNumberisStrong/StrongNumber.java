package GivenNumberisStrong;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n ;
		Scanner sc = new Scanner ( System .in ) ;
		System.out.println("Enter the number : ");
		n = sc . nextInt ( ) ;
		int sum=0;
		int fact=1;
		int copy=n;
		while(n!=0) {
		int rem=n%10;
		for(int i=rem ; i>=1;i--)
		{
		fact=fact*i;
		}
		sum=sum + rem;
		n=n/10;
		}
		if(copy==sum) {
		System.out.println("It is Strong no : " +copy);
		}
		else
		{
		System.out.println("It is not Strong no : " +copy);
		}
		

	}

}
