import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean repeat;

        do {
            System.out.println("Enter the first number: ");
            double n1 = scanner.nextDouble();
            System.out.println("Enter the next number: ");
            double n2 = scanner.nextDouble();
            double result = n1 + n2;
            System.out.println("Your sum result is: " + result);

            // Consume the newline left-over
            scanner.nextLine();

            System.out.println("Do you want to continue? (yes/no) ");
            String userResponse = scanner.nextLine().trim().toLowerCase();
            repeat = userResponse.equals("yes");

            // Print a message when the user decides to stop
            if (!repeat) {
                System.out.println("Run the code again to perform a new calculation");
            }

        } while (repeat);

        scanner.close();
    }
}
