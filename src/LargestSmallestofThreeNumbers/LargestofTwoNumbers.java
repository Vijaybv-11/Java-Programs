package LargestSmallestofThreeNumbers;

import java.util.Scanner;

public class LargestofTwoNumbers {

	public static void main(String[] args) {

		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		int large = a;
		if (b > large)
			large = b;
		System.out.println("Largest number is : " + large);

	}
}
