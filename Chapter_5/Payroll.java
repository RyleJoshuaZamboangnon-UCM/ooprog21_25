
import java.util.Scanner;

public class Payroll {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int hour;
        int employeeID = 101;
        double payrate = 0, regularPay, overtimePay;
        System.out.print("How many did you work for this week?:  ");
        hour = input.nextInt();
        System.out.print("What is your regulay pay?: ");
        payrate = input.nextDouble();

        Employee worker = new Employee(employeeID, payrate);

        regularPay = worker.calculateregularPay(hour);
        overtimePay = worker.calculateovertimePay(hour);

        System.out.print("Regular Pay is: " + regularPay);
        System.out.print("\nOvertime Pay is: " + overtimePay);

        input.close();
    }

}