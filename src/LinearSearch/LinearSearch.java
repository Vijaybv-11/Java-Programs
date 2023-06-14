package LinearSearch;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		str = sc.nextLine();
		int count = 0;
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				count++;
			}
			System.out.println(count);

		}
	}
}