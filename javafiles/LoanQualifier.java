
import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {
        int salaryRequired = 30000;
        int yearsWorkingRequired = 2;

        Scanner scanner = new Scanner(System.in);

        // Solicitar años trabajando
        System.out.println("Years working in your current job:");
        double userYearsWorking = scanner.nextDouble();

        // Solicitar salario anual
        System.out.println("Please enter your annual salary:");
        double userSalary = scanner.nextDouble();
        scanner.close();

        // Verificación de las condiciones
        if (userYearsWorking >= yearsWorkingRequired && userSalary >= salaryRequired) {
            System.out.println("Congratulations, you qualify for the loan.");
        } else {
            System.out.println("Sorry, you do not qualify for the loan.");

            // Mensajes específicos sobre qué condición no cumplió
            if (userYearsWorking < yearsWorkingRequired) {
                System.out.println("You haven't worked long enough in your current job.");
            }
            if (userSalary < salaryRequired) {
                System.out.println("Your salary is below the required threshold.");
            }
        }
    }
}
