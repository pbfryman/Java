import javax.swing.JOptionPane;

public class cookieCalories
{
   public static void main(String[] args)
   {
      String cookieInput;
      double cookie;
      double bag = 40.0;
      double serving = 4;
      double totalServing;
      double calories = 300;
      double totalCalories;
      
      //Get user input
      cookieInput = JOptionPane.showInputDialog("How many cookies did you eat?");
      
      //Convert to double
      cookie = Double.parseDouble(cookieInput);
      
      //Calculate servings
      totalServing = cookie / serving;
      
      //Calculate calories
      totalCalories = totalServing * calories;
      
      //Display results
      JOptionPane.showMessageDialog(null, "You consumed " + totalCalories + " calories.");
   }
}   