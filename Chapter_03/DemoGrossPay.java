import java.util.Scanner;

public class DemoGrossPay{
   //main method
   public static void main(String [] a){
      Scanner sc = new Scanner(System.in);
   //   input
      System.out.print("Enter hours worked: ");
         double hours = sc.nextDouble();
         
         calculateGross(hours);
         
         sc.close();
   }
   //method
   public static void calculateGross(double hoursWorked){
      final double HOURLY_RATE = 22.75;
      
      double grossPay = hoursWorked * HOURLY_RATE;
      //output
      System.out.println("Gross Pay: " + grossPay);
   }
}
