import javax.swing.JOptionPane;

public class stockCommission
{
   public static void main(String[] args)
   {
      double stockPrice = 21.77;
      double stockAmount = 600;
      double commission = .2;
      double stockCommission;
      double amountPaid;
      double total;
      
      //Calculate amout paid
      amountPaid = (stockPrice * stockAmount);      
      
      //Calculate commission
      stockCommission = amountPaid * commission;
      
      //Calculate total
      total = amountPaid + stockCommission;
      
      //Display results
      JOptionPane.showMessageDialog(null, "Amount Paid: $" + amountPaid + 
                                    "\nCommission: $" + stockCommission + 
                                    "\nTotal: $" + total); 
   }
}   