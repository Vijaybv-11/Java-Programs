package SwapNumbers;

import java.util.Scanner;

public class SwapofTwoNumbers_with_ThirdVariable {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After swapping the value of a is : " + a);
		System.out.println("After swapping the value of b is : " + b);
	}

}
