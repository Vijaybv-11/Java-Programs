package StringClassPrograms;

public class StringReversal {
    public static void main(String[] args) {
        String text = "Hello, world!";
        String reversedText = new StringBuilder(text).reverse().toString();
        System.out.println("Reversed Text: " + reversedText);
    }
}
