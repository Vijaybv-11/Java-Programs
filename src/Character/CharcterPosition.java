package Character;

import java.util.Scanner;

public class CharcterPosition {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			System.out.println("Character at " + i + " Position : " + ch);

		}
	}
}