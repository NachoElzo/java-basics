package javafiles;

import java.util.Scanner;

public class BonusSalaryCalculator {
    public static void main(String[] args) {
        double juniorSalary = 2200.5;
        double seniorSalary = 2900.8;

        double salary = 0;
        int baseBonus = 250;
        int goalBonus = 1000;

        System.out.println("Enter employee name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Enter the employee category: 'junior', 'senior'");
        String employeeCategory = scanner.nextLine();

        System.out.println("How many sales did the employee make this month?");
        int monthlySales = scanner.nextInt();
        scanner.close();

        if (employeeCategory.equals("junior") && monthlySales >= 10) {
            salary = juniorSalary + baseBonus + goalBonus;
        } else if (employeeCategory.equals("senior") && monthlySales >= 10) {
            salary = seniorSalary + baseBonus + goalBonus;
        } else if (employeeCategory.equals("senior") && monthlySales < 10) {
            salary = seniorSalary + baseBonus;
        } else if (employeeCategory.equals("junior") && monthlySales < 10) {
            salary = juniorSalary + baseBonus;
        } else {
            System.out.println("Please enter a valid salary category");
            return; // Stop execution if the category is invalid
        }

        // Output the result using printf for formatted output
        System.out.printf("%s's salary is: $ %.2f\n", name, salary);
    }
}
