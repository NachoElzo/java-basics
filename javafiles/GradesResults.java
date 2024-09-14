import java.util.Scanner;

public class GradesResults {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your grade [a, b, c, d]");
        String grade = scanner.nextLine();
        scanner.close();

        switch (grade) {
            case "A":
                System.out.println("Excellent job");
                break;
            case "B":
                System.out.println("Great job");
                break;
            case "C":
                System.out.println("Good job");
                break;
            case "D":
                System.out.println("You need to work a bit harder");
                break;
            default:
                System.out.println("Please enter a valid grade, between the options");
                break;
        }

    }

}
