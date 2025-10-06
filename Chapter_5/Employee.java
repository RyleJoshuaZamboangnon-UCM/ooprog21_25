
public class Employee {

    private int employeeID;
    private double payrate;
  

    public Employee(int employeeID, double payrate) {
        this.employeeID = employeeID;
        this.payrate = payrate;
    }

    public double calculateregularPay(int hour) {

        if (hour <= 40) {
            return hour * payrate;
        } else {
            return 40 * payrate;
        }
    }

    public double calculateovertimePay(int hour) {

        if (hour >= 40) {
           int overtimehour = hour - 40;
            return overtimehour * payrate * 1.5;
        } else {
            return 0;
        }
    }
}