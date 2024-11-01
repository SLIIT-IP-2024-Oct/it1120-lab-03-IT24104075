import java.util.Scanner;

public class IT24104075Lab3Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for the monthly salary
        System.out.print("Enter the monthly salary: ");
        double monthlySalary = scanner.nextDouble();
        
        // Prompt user for the number of OT hours
        System.out.print("Enter the number of OT hours: ");
        double otHours = scanner.nextDouble();
        
        // Prompt user for the OT hourly rate
        System.out.print("Enter the OT hourly rate: ");
        double otHourlyRate = scanner.nextDouble();
        
        // Calculate OT amount and total salary
        double otAmount = otHours * otHourlyRate;
        double totalSalary = monthlySalary + otAmount;
        
        // Display the results
        System.out.printf("OT Amount: %.2f\n", otAmount);
        System.out.printf("Total Salary: %.2f\n", totalSalary);
        
        // Close the scanner
        scanner.close();
    }
}