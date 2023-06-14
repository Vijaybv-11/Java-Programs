package ReverseofString;

public class Withoutloop {

	static String s1 = "java";
	static String s2 = " ";

	public static void main(String[] args) {
		int x = s1.length() - 1;
		disp(x);
		System.out.println(s2);
	}

	static void disp(int n) {
		if (n >= 0) {
			s2 = s2 + s1.charAt(n);
			n--;
			disp(n);
		}
	}

}
