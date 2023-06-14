package PositiveOrNegativeNumber;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		num = sc.nextInt();
		if (num > 0) {
			System.out.println(num + " is a positive number");
		}
		if (num < 0) {
			{
				System.out.println(num + " is a negative number");
			}
		}
	}
}
