import javax.swing.JOptionPane;

public class testAverage
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
      inputOne = JOptionPane.showInputDialog("Please enter test 1 score:");
      
      //Get test two
      inputTwo = JOptionPane.showInputDialog("Please enter test 2 score:");
      
      //Get test three
      inputThree = JOptionPane.showInputDialog("Please enter test 3 score:");
      
      //Convert scores
      testOne = Double.parseDouble(inputOne);
      testTwo = Double.parseDouble(inputTwo);
      testThree = Double.parseDouble(inputThree);
      
      //Calculate average
      average = (testOne + testTwo + testThree) / 3;
      
      //Display results
      JOptionPane.showMessageDialog(null, "Test 1: " + testOne + 
                                    "\nTest 2: " + testTwo + 
                                    "\nTest 3: " + testThree + 
                                    "\nAverage: " + average);   
   }
}   