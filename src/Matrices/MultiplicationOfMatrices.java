package Matrices;

import java.util.Scanner;

public class MultiplicationOfMatrices {

	public static void main(String[] args) {
		int m, n, p, q, sum = 0, c, d, k;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for rows and columns of 1stmatrix : ");
		m = sc.nextInt();
		n = sc.nextInt();
		int a[][] = new int[m][n];
		System.out.println("Enter the numbers of 1st matrix : ");
		for (c = 0; c < m; c++)
			for (d = 0; d < n; d++)
				a[c][d] = sc.nextInt();
		System.out.println("Enter the number for rows and columns of 2ndmatrix : ");
		p = sc.nextInt();
		q = sc.nextInt();
		if (n != p)
			System.out.println("matrices entered order can't be multipliedwith each other");
		else {
			int b[][] = new int[p][q];
			int multiply[][] = new int[m][q];
			System.out.println("Enter the elements of 2nd matrix : ");
			for (c = 0; c < p; c++)
				for (d = 0; d < q; d++)
					b[c][d] = sc.nextInt();
			for (c = 0; c < m; c++) {
				for (d = 0; d < q; d++) {
					for (k = 0; k < p; k++) {
						sum = sum + a[c][k] * b[k][d];
					}
					multiply[c][d] = sum;
					sum = 0;
				}
			}
			System.out.println("Multiplication of matrices: ");
			for (c = 0; c < m; c++) {
				for (d = 0; d < q; q++)
					System.out.println(multiply[c][d] + "\t");
				System.out.println("\n");
			}

		}
	}
}