package Matrices;

import java.util.Scanner;

public class AdditionOTwofMatrices {
	public static void main(String[] args) {
		{
			int rows, cols, c, d;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number for rows and columns : ");
			rows = sc.nextInt();
			cols = sc.nextInt();
			int a[][] = new int[rows][cols];
			int b[][] = new int[rows][cols];
			int sum[][] = new int[rows][cols];
			System.out.println("Enter the elements of 1st matrix : ");
			for (c = 0; c < rows; c++)
				for (d = 0; d < cols; d++)
					a[c][d] = sc.nextInt();
			System.out.println("Enter the elements of 2nd matrix : ");
			for (c = 0; c < rows; c++)
				for (d = 0; d < cols; d++)
					b[c][d] = sc.nextInt();
			for (c = 0; c < rows; c++)
				for (d = 0; d < cols; d++)
					sum[c][d] = a[c][d] + b[c][d];
			System.out.println("Sum of the matrices : ");
			for (c = 0; c < rows; c++) {
				for (d = 0; d < cols; d++) {
					System.out.println(sum[c][d] + "\t");
				}

			}
		}
	}
}