package SimpleInterest;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float p, t, r, Si;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal : ");
		p = sc.nextFloat();
		System.out.println("Enter the Time period : ");
		t = sc.nextFloat();
		System.out.println("Enter the Rate of interest : ");
		r = sc.nextFloat();
		Si = (p * t * r) / 100;
		System.out.println("Simple interest is : " + Si);
	}

}
