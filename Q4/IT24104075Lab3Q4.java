import java.util.Scanner;

public class IT24104075Lab3Q4 {
    public static void main(String[] args) {
        int number, digit1, digit2, digit3, digit4, digit5;

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a five-digit number
        System.out.print("Enter a five-digit number: ");
        number = input.nextInt(); // Assuming the user enters 52348

        // Extract the highest place value digit (ten thousand)
        digit1 = number / 10000; // 52348 / 10000 = 5 (integer division)
        number %= 10000; // number = 52348 % 10000 = 2348 (remainder)

        // Extract the next place value digit (thousand)
        digit2 = number / 1000; // 2348 / 1000 = 2
        number %= 1000; // number = 2348 % 1000 = 348

        // Extract the next place value digit (hundred)
        digit3 = number / 100; // 348 / 100 = 3
        number %= 100; // number = 348 % 100 = 48

        // Extract the next place value digit (ten)
        digit4 = number / 10; // 48 / 10 = 4
        number %= 10; // number = 48 % 10 = 8

        // Extract the last place value digit (unit)
        digit5 = number; // 8

        // Display the extracted digits
        System.out.println("The extracted digits are:");
        System.out.println("Ten thousand: " + digit1);
        System.out.println("Thousand: " + digit2);
        System.out.println("Hundred: " + digit3);
        System.out.println("Ten: " + digit4);
        System.out.println("Unit: " + digit5);

        input.close();
    }
}