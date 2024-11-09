import java.util.Scanner;

public class IT24104075Lab3Q1A {

    public static void main(String[] args) {

        // Declare the variables
        double pricePerkg, quantity, totalAmount;

        // create a Scanner object to read
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the price per kilogram of rice
        System.out.print("Enter the price of 1kg of rice: ");
        pricePerkg = input.nextDouble();

        // Prompt the user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        quantity = input.nextDouble();

        // Calculate the total amount to be paid
        totalAmount = pricePerkg * quantity;

        // Display the total amount
        System.out.println("The total amount is: " + totalAmount);
    }
}