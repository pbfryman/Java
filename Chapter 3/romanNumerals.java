import javax.swing.JOptionPane;

public class romanNumerals
{
   public static void main(String[] args)
   {
      String input;
      double number;
      
      //Get user input
      input = JOptionPane.showInputDialog("Please enter a number within the range of 1 through 10: ");
      
      //Convert input to a double
      number = Double.parseDouble(input);
      
      //boolean
      if (number < 1 || number > 10)
      {
         JOptionPane.showMessageDialog(null, "Invalid number.");
      }
      else if (number == 1)
      {
         JOptionPane.showMessageDialog(null, "Roman Numeral: I");
      }
      else if (number == 2)
      {
         JOptionPane.showMessageDialog(null, "Roman Numeral: II");
      }
      else if (number == 3)
      {
         JOptionPane.showMessageDialog(null, "Roman Numeral: III");
      }
      else if (number == 4)
      {
         JOptionPane.showMessageDialog(null, "Roman Numeral: IV");
      }
      else if (number == 5)
      {
         JOptionPane.showMessageDialog(null, "Roman Numeral: V");
      }
      else if (number == 6)
      {
         JOptionPane.showMessageDialog(null, "Roman Numeral: VI");
      }
      else if (number == 7)
      {
         JOptionPane.showMessageDialog(null, "Roman Numeral: VII");
      }
      else if (number == 8)
      {
         JOptionPane.showMessageDialog(null, "Roman Numeral: VIII");
      }
      else if (number == 9)
      {
         JOptionPane.showMessageDialog(null, "Roman Numeral: IX");
      }
      else if (number == 10)
      {
         JOptionPane.showMessageDialog(null, "Roman Numeral: X");
      }  
   }
}   