import java.util.Scanner;

public class BankBalanceCalculator {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double balance;
        double interestRate = 0.03; // Default 3%
        int year = 1;
        int choice;

        System.out.print("Enter initial balance >> ");
        balance = keyboard.nextDouble();

        do {
            // Calculate interest and update balance
            balance = balance + (balance * interestRate);
            System.out.println("After year " + year + " at " + interestRate + 
                               " interest rate, balance is $" + balance);
            year++;

            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = keyboard.nextInt();
        } while(choice == 1);

        keyboard.close();
        System.out.println("Thank you for using the bank balance calculator!");
    }
}