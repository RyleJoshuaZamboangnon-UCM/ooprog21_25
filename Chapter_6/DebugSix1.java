// Start with a penny
// double it every day
// how much do you have in x number of days?
import java.util.Scanner;

public class DebugSix1
{
   public static void main(String args[])
   {
      Scanner keyboard = new Scanner(System.in);
      int days;
      double money = 0.01;
      int day = 1;
      System.out.print("Enter number of days >> "); // Fixed missing semicolon
      days = keyboard.nextInt();
      while(day <= days) // Fixed loop condition
      {
         System.out.println("After day " + day + " you have " + money); // Fixed variable
         money = 2 * money;
         ++day;
      }
      keyboard.close(); // Always good to close the scanner
   }
}