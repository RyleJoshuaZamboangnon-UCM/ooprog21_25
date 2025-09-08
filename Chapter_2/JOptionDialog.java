

import javax.swing.JOptionPane;
public class JOptionDialog {
         
           public static void main(String args []) {
    String Name;
    int confirmation = 0, number = 1;
      do {
       Name = JOptionPane.showInputDialog("What is your Name: ");
          if (Name == null) {
                   confirmation += number;
          } else {
           
             JOptionPane.showMessageDialog(null, "Hello");
             confirmation = JOptionPane.showConfirmDialog(null, "Wanna say hello too?");
          }
               
       
      } while (confirmation == 1);
             
              JOptionPane.showMessageDialog(null, "Hello, How are you? " + Name);
           }     
}
