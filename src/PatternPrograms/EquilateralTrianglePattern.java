package PatternPrograms;

import java.util.Scanner;

public class EquilateralTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the equilateral triangle: ");
        int height = scanner.nextInt();
        
        for (int i = 1; i <= height; i++) {
           
            for (int j = 1; j <= height - i; j++) {
                System.out.print(" ");
            }
            
           
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}
