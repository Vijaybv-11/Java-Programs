package SwapNumbers;

import java.util.Scanner;

public class SwapTwoNumbers_WithoutThirdVariable {
	
	public static void main(String[] args)
	{
	int a ,b ;
	Scanner sc = new Scanner ( System .in ) ;
	System.out.println("Enter the value of a and b : ");
	a = sc . nextInt () ;
	b = sc . nextInt () ;
	a = a + b;
	b = a - b;
	a = a - b;
	System.out.println("After swapping the value of a is : "+a);
	System.out.println("After swapping the value of b is : "+b);
	}
}
