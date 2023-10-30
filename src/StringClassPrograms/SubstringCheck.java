package StringClassPrograms;

public class SubstringCheck {
    public static void main(String[] args) {
        String text = "Hello, world!";
        boolean containsHello = text.contains("Hello");
        boolean containsEarth = text.contains("Earth");
        System.out.println("Contains 'Hello': " + containsHello);
        System.out.println("Contains 'Earth': " + containsEarth);
    }
}
