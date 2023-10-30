package StringClassPrograms;

public class StringFormatting {
    public static void main(String[] args) {
        String name = "jAY";
        int age = 22;
        double height = 5.11;
        
        String formattedString = String.format("Name: %s, Age: %d, Height: %.2f", name, age, height);
        System.out.println(formattedString);
    }
}
