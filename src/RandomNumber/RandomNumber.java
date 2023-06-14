package RandomNumber;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random rm = new Random();
		System.out.println("Random numbers are : ");
		System.out.println("*******************");
		for (int i = 1; i <= 5; i++) {
			System.out.println(rm.nextInt(10));

		}
	}
}