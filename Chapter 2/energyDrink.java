import javax.swing.JOptionPane;

public class energyDrink
{
   public static void main(String[] args)
   {
      double members = 12467;
      double percentDrinks = .14;
      double drinkMembers;
      double percentFlavor = .64;
      double drinkFlavor;
      
      //Calculate number of members who drink more than one per week
      drinkMembers = members * percentDrinks;
      
      //Calculate number who prefer flavored drink
      drinkFlavor = drinkMembers * percentFlavor;
      
      //Display result
      JOptionPane.showMessageDialog(null, "More than 1 drink per week: " + drinkMembers + 
                                    "\nPrefer citrus flavor: " + drinkFlavor);
   }
}  