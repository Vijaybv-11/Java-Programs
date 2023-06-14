package GenerateRandomOTP;

import java.util.Random;

public class RandomOTP {

	public static void main(String[] args) {

		String s1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String s2 = s1.toLowerCase();
		String s3 = "123456789";
		String s4 = s1 + s2 + s3;
		Random r = new Random();
		char[] pwd = new char[6];
		for (int i = 0; i < 6; i++) {
			pwd[i] = s4.charAt(r.nextInt(s4.length()));
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(pwd[i]);

		}
	}
}
