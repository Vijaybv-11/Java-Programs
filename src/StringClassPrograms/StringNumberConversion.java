package StringClassPrograms;

public class StringNumberConversion {
    public static void main(String[] args) {
        String numStr = "123";
        int num = Integer.parseInt(numStr);
        int sum = num + 7;
        
        String resultStr = Integer.toString(sum);
        System.out.println("Sum: " + resultStr);
    }
}

