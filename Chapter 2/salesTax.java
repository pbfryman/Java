import javax.swing.JOptionPane;

public class salesTax
{
   public static void main(String[] args)
   {
      String inputPurchase; //purchase amount input
      double purchase; //purchase amount
      double stateTax = .04; //sales tax
      double stateTotal;
      double countyTax = .02; //county tax
      double countyTotal;
      double totalTax; //total tax
      
      //Get purchase amount
      inputPurchase = JOptionPane.showInputDialog("Please enter the amount of your purchase: ");
      
      //Convert input to double
      purchase = Double.parseDouble(inputPurchase);
      
      //Calculate state tax
      stateTotal = purchase * stateTax;
      
      //Calculate county tax
      countyTotal = purchase * countyTax;
      
      //Calculate total tax
      totalTax = stateTotal + countyTotal;
      
      //Display results
      JOptionPane.showMessageDialog(null, "Purchase: $" + purchase + 
                                    "\nState Tax: $" + stateTotal + 
                                    "\nCounty Tax: $" + countyTotal + 
                                    "\nTotal Tax: $" + totalTax);
   }
}   