package GradeOfStudent;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks : ");
		marks = sc.nextInt();
		if (marks >= 85 && marks <= 100)
			System.out.println("Distinction : " + marks);
		else if (marks >= 60)
			System.out.println("First class : " + marks);
		else if (marks >= 50)
			System.out.println("Second class : " + marks);
		else if (marks >= 35)
			System.out.println("Pass : " + marks);
		else
			System.out.println("Fail : " + marks);
	}

}
