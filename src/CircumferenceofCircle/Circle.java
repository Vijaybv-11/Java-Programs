package CircumferenceofCircle;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		int r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		r = sc.nextInt();
		final double pi = 3.142;
		double area = pi * r * r;
		double circum = 2 * pi * r;
		System.out.println("Area of the Circle : " + area);
		System.out.println("Circumference of the Circle : " + circum);
	}
}
