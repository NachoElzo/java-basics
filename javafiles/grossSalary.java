import java.util.Scanner;

public class grossSalary {

    public static void main(String[] args) {

        double maxHours = 160;
        double minHours = 1;
        double rateHours = 20;
        System.out.println("Please enter you worked hours");
        Scanner scanner = new Scanner(System.in);
        double workedHours = scanner.nextDouble();

        while (workedHours > maxHours || workedHours < minHours) {
            System.err.println("Sorry, enter between 1 - 40");
            workedHours = scanner.nextDouble();
        }
        scanner.close();
        double salaryGross = workedHours * rateHours;
        System.out.println("Your salary is: €" + salaryGross);
    }

}
