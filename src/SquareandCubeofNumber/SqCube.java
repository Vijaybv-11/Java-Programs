package SquareandCubeofNumber;

import java.util.Scanner;

public class SqCube {

	public static void main(String[] args) {

		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		a = sc.nextInt();
		int square = a * a;
		int cube = a * a * a;
		System.out.println("Square of the number : " + square);
		System.out.println("Cube of the number : " + cube);
	}

}
