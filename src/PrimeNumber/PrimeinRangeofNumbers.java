package PrimeNumber;

import java.util.Scanner;

public class PrimeinRangeofNumbers {
	
	
	public static void main(String[] args) {
		int range ;
		Scanner sc = new Scanner(System.in);
		range =sc.nextInt();
		for(int k=2;k<=range;k++)
		{
		int n=k;
		boolean flag=true;
		for(int i=2;i<n ; i++)
		{
		if(n % i ==0)
		{
		flag=false;
		break;
		}
		}
		if(flag==true)
		{
		System.out.println("It is a prime number : " +n);
		}
		}

	}

}
