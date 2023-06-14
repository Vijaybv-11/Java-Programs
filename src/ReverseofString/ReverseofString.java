package ReverseofString;

import java.util.Scanner;

public class ReverseofString {
	public static void main(String[] args) {
		String s1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		s1 = sc.nextLine();
		String s2 = " ";
		for (int i = s1.length() - 1; i >= 0; i--) {
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("reverse String is : " + s2);
	}

}
