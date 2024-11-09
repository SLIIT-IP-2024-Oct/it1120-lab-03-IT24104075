import java.util.Scanner;

public class IT24104075Lab3Q1B {

    public static void main(String[] args) {

        // Declare the variables
        double pricePerkg, quantity, totalAmount, discount, finalAmount;

        // Declare and initialize variables:
        discount = 0.18;  // Discount is 18%

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the price per kilogram of rice
        System.out.print("Enter the price of 1kg of rice: ");
        pricePerkg = input.nextDouble();

        // Prompt the user to enter the number of kilograms they want to buy
        System.out.print("Enter the number of kilograms you want to buy: ");
        quantity = input.nextDouble();

        // Calculate the total amount to be paid
        totalAmount = pricePerkg * quantity;

        // Calculate the discount (18% of the total amount)
        discount = totalAmount * discount;

        // Calculate the final amount after the discount
        finalAmount = totalAmount - discount;

        // Display the final amount
        System.out.println("Total amount before discount: $" + totalAmount);
        System.out.println("Discount: $" + discount);
        System.out.println("Final amount: $" + finalAmount);
    }
}