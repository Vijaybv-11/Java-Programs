package CompoundInterest;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int p, t, n;
		double r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal : ");
		p = sc.nextInt();
		System.out.println("Enter the Time period : ");
		t = sc.nextInt();
		System.out.println("Enter the Rate of interest : ");
		r = sc.nextDouble();
		System.out.println("Enter the number :");
		n = sc.nextInt();
		double amount = p * Math.pow(1 + (r / n), n * t);
		double compinterest = amount - p;
		System.out.println("Compound Interest after " + t + " years :" + compinterest);
		System.out.println("Amount after " + t + " years : " + amount);
	}

}
