package LargestSmallestofThreeNumbers;

import java.util.Scanner;

public class LargestofFirstSecondThird {

	public static void main(String[] args) {

		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a , b and c : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int largest = a;
		int smallest = a;
		if (b > largest)
			largest = b;
		if (c > largest)
			largest = c;
		if (b < smallest)
			smallest = b;
		if (c < smallest)
			smallest = c;
		int seclargest = (a + b + c) - (largest + smallest);
		System.out.println("Largest number is : " + largest);
		System.out.println("Second largest number is : " + seclargest);
		System.out.println("Smallest number is : " + smallest);
	}

}
