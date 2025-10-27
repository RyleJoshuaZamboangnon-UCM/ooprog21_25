

import java.util.Scanner;

public class BankBalanceByRateAndYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user for initial bank balance
        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        // Interest rates (2%, 3%, 4%, 5%)
        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        // Outer loop: for each interest rate
        for (int i = 0; i < interestRates.length; i++) {
            double rate = interestRates[i];
            double newBalance = balance;

            System.out.println();
            System.out.printf("With an initial balance of %.1f at an interest rate of %.2f%n", balance, rate);

            // Inner loop: calculate balance for 1–4 years
            for (int year = 1; year <= 4; year++) {
                newBalance = newBalance + (newBalance * rate);
                System.out.printf("After year %d balance is %.4f%n", year, newBalance);
            }
        }

        input.close();
      
    }
}