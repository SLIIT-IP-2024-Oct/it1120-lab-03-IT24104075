import java.util.Scanner;

public class IT24104075Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the amount
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();
        
        // Denominations array
        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        
        // Array to store the count of each denomination
        int[] count = new int[denominations.length];
        
        // Calculate the number of notes/coins for each denomination
        for (int i = 0; i < denominations.length; i++) {
            count[i] = amount / denominations[i]; // Get the number of notes/coins
            amount %= denominations[i]; // Update the amount
        }
        
        // Print the result
        for (int i = 0; i < denominations.length; i++) {
            System.out.printf("%d Notes – %d\n", denominations[i], count[i]);
        }
        
        // Close the scanner
        scanner.close();
    }
}