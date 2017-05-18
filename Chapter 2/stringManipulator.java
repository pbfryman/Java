import javax.swing.JOptionPane;

public class stringManipulator
{
   public static void main(String[] args)
   {
      String city;
      int stringSize;
      String upper;
      String lower;
      char letter;
      
      //Get city
      city = JOptionPane.showInputDialog("Please enter your favorite city");
      
      //String size
      stringSize = city.length();
      
      //Convert to upper
      upper = city.toUpperCase();
      
      //Convert to lower
      lower = city.toLowerCase();
      
      //Character
      letter = city.charAt(0);
      
      //Display output
      JOptionPane.showMessageDialog(null, "City: " + city + "\nString Length: " + stringSize + 
                                    "\nUppercase: " + upper + "\nLowercase: " + lower + 
                                    "\nFirst Character: " + letter);
   }
}   