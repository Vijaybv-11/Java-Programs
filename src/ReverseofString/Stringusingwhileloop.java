package ReverseofString;

import java.util.Scanner;

public class Stringusingwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		s1 = sc.nextLine();
		String s2 = " ";
		int i = s1.length() - 1;
		while (i >= 0) {
			s2 = s2 + s1.charAt(i);
			i--;
		}
		System.out.println("reverse String is : " + s2);
	}

}
