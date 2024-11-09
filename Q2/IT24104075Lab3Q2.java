import java.util.Scanner;

public class IT24104075Lab3Q2 {
	
 public static void main(String[] args) {

        // Declare the variables
        double monthlySalary, otHours, otHourlyRate, otAmount, totalSalary;

        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the monthly salary
        System.out.print("Enter the monthly salary: ");
        monthlySalary = input.nextDouble();

        // Prompt the user to enter the number of OT hours
        System.out.print("Enter the number of OT hours: ");
        otHours = input.nextDouble();

        // Prompt the user to enter the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        otHourlyRate = input.nextDouble();

        // Calculate the OT amount
        otAmount = otHours * otHourlyRate;

        // Calculate the total salary
        totalSalary = monthlySalary + otAmount;

        // Display the total salary
        System.out.println("Total Salary: " + totalSalary);

        input.close();
    }
}
