import javax.swing.JOptionPane;

public class sortedNames
{
   public static void main(String[] args)
   {
      String nameOne;
      char one;
      String nameTwo;
      char two;
      String nameThree;
      char three;
      
      //Get names
      nameOne = JOptionPane.showInputDialog("Please enter name 1:");
      nameTwo = JOptionPane.showInputDialog("Please enter name 2:");
      nameThree = JOptionPane.showInputDialog("Please enter name 3:");
      
      //Get first letter
      one = nameOne.charAt(0);
      two = nameTwo.charAt(0);
      three = nameThree.charAt(0);
      
      //Boolean
   }
}   