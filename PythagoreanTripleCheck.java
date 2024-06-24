import java.util.Scanner;

public class PythagoreanTripleCheck {
    
    // Method to check if the sides form a Pythagorean triple
    public static boolean isPythagoreanTriple(int a, int b, int c) {
        // Sort the sides to find the largest side (c)
        int[] sides = {a, b, c};
        java.util.Arrays.sort(sides);  // Sorting the sides
        
        a = sides[0];
        b = sides[1];
        c = sides[2];
        
        // Check if it satisfies the Pythagorean theorem
        if (a * a + b * b == c * c) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input from the user
        System.out.print("Enter the length of side a: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter the length of side b: ");
        int b = scanner.nextInt();
        
        System.out.print("Enter the length of side c: ");
        int c = scanner.nextInt();
        
        // Check if it forms a Pythagorean triple
        boolean result = isPythagoreanTriple(a, b, c);
        
        // Output the result
        System.out.printf("The sides %d, %d, %d form a Pythagorean triple: %b\n", a, b, c, result);
        
        scanner.close();
    }
}
