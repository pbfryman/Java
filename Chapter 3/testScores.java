import javax.swing.JOptionPane;

public class testScores
{
   public static void main(String[] args)
   {
      String inputOne;
      String inputTwo;
      String inputThree;
      double testOne;
      double testTwo;
      double testThree;
      double average;
      
      //Get test one
      inputOne = JOptionPane.showInputDialog("Please enter test score 1: ");
      
      //Get test two
      inputTwo = JOptionPane.showInputDialog("Please enter test score 2: ");
      
      //Get test three
      inputThree = JOptionPane.showInputDialog("Please enter test score 3: ");
      
      //Convert to doubles
      testOne = Double.parseDouble(inputOne);
      testTwo = Double.parseDouble(inputTwo);
      testThree = Double.parseDouble(inputThree);
      
      //Calculate average
      average = (testOne + testTwo + testThree) / 3;
      
      //Determine letter grade
      if (average < 60)
      {
         JOptionPane.showMessageDialog(null, "You received a F");
      }
      else
      {
         if (average < 70)
         {
            JOptionPane.showMessageDialog(null, "You received a D");
         }
         else
         {
            if (average < 80)
            {
               JOptionPane.showMessageDialog(null, "You received a C");
            }
            else
            {
               if (average < 90)
               {
                  JOptionPane.showMessageDialog(null, "You received a B");
               }
               else
               {
                  JOptionPane.showMessageDialog(null, "You received an A");
               }
            }
         }
      }   
   }
}   