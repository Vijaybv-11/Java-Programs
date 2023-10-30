package StringClassPrograms;

public class StringToCharArray {
    public static void main(String[] args) {
        String text = "Hello";
        char[] charArray = text.toCharArray();
        
        for (char c : charArray) {
            System.out.print(c + " ");
        }
    }
}
