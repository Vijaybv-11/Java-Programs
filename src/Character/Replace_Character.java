package Character;

public class Replace_Character {

	public static void main(String[] args) {
		String s1 = "java";
		String s2 = " ";
		char[] arr = s1.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a') {
				s2 = s2 + 'o';
			} else {
				s2 = s2 + arr[i];
			}
		}
		System.out.println(s2);

	}
}