import java.util.Scanner;

public class ProductCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("number of articles");
        int productNumber = scanner.nextInt();
        double total = 0;

        for (int i = 0; i < productNumber; i++) {
            System.out.println("Please enter the product price");
            double price = scanner.nextDouble();
            total = total + price;

        }
        scanner.close();
        System.out.println("The total ammoun is : €" + total);

    }
}
