import java.util.Scanner;

public class BankBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get initial bank balance
        System.out.print("Enter initial bank balance > ");
        double balance = scanner.nextDouble();

        // Get interest rate
        double interestRate = 0.03;

        int year = 1;
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.println("Do you want to see next year's balance?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                // Calculate balance after one year
                balance = balance * (1 + interestRate);

                // Print the balance
                System.out.printf("After year " + year + " at %.2f interest rate, balance is $%.1f%n", interestRate, balance);

                year++; // Increment year
                System.out.println("Do you want to see the balance at the end of another year?");
                System.out.print("Enter 1 for yes or any other number for no >> ");
                choice = scanner.nextInt();
                if (choice != 1) {
                    continueCalculating = false;
                }

            } else {
                continueCalculating = false;
            }
        }
        System.out.println("---jGRASP: Operation complete.");
        scanner.close();
    }
}