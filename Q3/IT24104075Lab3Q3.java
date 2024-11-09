import java.util.Scanner;

public class IT24104075Lab3Q3 {

    public static void main(String[] args) {
        // Declare and initialize variables
        int amount;
        int count5000 = 0;
        int count1000 = 0;
        int count500 = 0;
        int count200 = 0;
        int count100 = 0;
        int count50 = 0;
        int count20 = 0;
        int count10 = 0;
        int count5 = 0;
        int count2 = 0;
        int count1 = 0;

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Input the rupee amount
        System.out.print("Enter the Rupee amount: ");
        amount = input.nextInt();

        // Calculate the number of notes of each denomination
        count5000 = amount / 5000;
        amount %= 5000;

        count1000 = amount / 1000;
        amount %= 1000;

        count500 = amount / 500;
        amount %= 500;

        count200 = amount / 200;
        amount %= 200;

        count100 = amount / 100;
        amount %= 100;

        count50 = amount / 50;
        amount %= 50;

        count20 = amount / 20;
        amount %= 20;

        count10 = amount / 10;
        amount %= 10;

        count5 = amount / 5;
        amount %= 5;

        count2 = amount / 2;
        amount %= 2;

        count1 = amount;

        // Display the result
        System.out.println("Number of 5000 notes: " + count5000);
        System.out.println("Number of 1000 notes: " + count1000);
        System.out.println("Number of 500 notes: " + count500);
        System.out.println("Number of 200 notes: " + count200);
        System.out.println("Number of 100 notes: " + count100);
        System.out.println("Number of 50 notes: " + count50);
        System.out.println("Number of 20 notes: " + count20);
        System.out.println("Number of 10 notes: " + count10);
        System.out.println("Number of 5 notes: " + count5);
        System.out.println("Number of 2 notes: " + count2);
        System.out.println("Number of 1 notes: " + count1);

        input.close();
    }
}