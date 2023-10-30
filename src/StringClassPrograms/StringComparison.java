package StringClassPrograms;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Bye";
        String str3 = new String("Hello");

        boolean isEqual1 = str1.equals(str2);
        boolean isEqual2 = str1.equals(str3);
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase("HELLO");

        System.out.println("str1 equals str2: " + isEqual1);
        System.out.println("str1 equals str3: " + isEqual2);
        System.out.println("str1 equalsIgnoreCase HELLO: " + isEqualIgnoreCase);
    }
}
