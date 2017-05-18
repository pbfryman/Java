import javax.swing.JOptionPane;

public class ingredientAdjuster
{
   public static void main(String[] args)
   {
      String inputCookies;
      double totalCookies;
      double sugar = 1.5;
      double butter = 1;
      double flour = 2.75;
      double cookies = 48;
      double totalSugar;
      double totalButter;
      double totalFlour;
      double serving;
      
      //Get number of cookies
      inputCookies = JOptionPane.showInputDialog("How many cookies would you like to bake?");
      
      //Convet cookies
      totalCookies = Double.parseDouble(inputCookies);
      
      //Calculate serving size
      serving = totalCookies / cookies;
      
      //Calculate sugar
      totalSugar = sugar * serving;
      
      //Calculate butter
      totalButter = butter * serving;
      
      //Calculate flour
      totalFlour = flour * serving;
      
      //Display results
      JOptionPane.showMessageDialog(null, "Sugar: " + totalSugar + " cups" + 
                                    "\nButter: " + totalButter + " cups" + 
                                    "\nFlour: " + totalFlour + " cups");
      
   }
}   