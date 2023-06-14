package AreaOfTriangle;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {

		int s1, s2, s3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of s1 , s2 and s3 :");
		s1 = sc.nextInt();
		s2 = sc.nextInt();
		s3 = sc.nextInt();
		int s = (s1 + s2 + s3) / 2;
		int area = (s * (s - s1) * (s - s2) * (s - s3));
		System.out.println("Area of a Triangle : " + area);
	}

}
