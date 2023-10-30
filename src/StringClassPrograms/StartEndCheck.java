package StringClassPrograms;

public class StartEndCheck {
    public static void main(String[] args) {
        String text = "Hello, world!";
        boolean startsWithHello = text.startsWith("Hello");
        boolean endsWithWorld = text.endsWith("world!");
        System.out.println("Starts with 'Hello': " + startsWithHello);
        System.out.println("Ends with 'world!': " + endsWithWorld);
    }
}
