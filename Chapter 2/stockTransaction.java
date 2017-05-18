import javax.swing.JOptionPane;

public class stockTransaction
{
   public static void main(String[] args)
   {
      double stockBought = 1000;
      double buyPrice = 32.87;
      double buySubtotal;
      double buyTotal;
      double commission = .2;
      double commissionBuy;
      double commissionSold;
      double stockSold = 1000;
      double soldPrice = 33.92;
      double soldSubtotal;
      double soldTotal;
      double profit;
      
      //Calculate subtotal buy price
      buySubtotal = stockBought * buyPrice;
      
      //Calculate buy commission
      commissionBuy = buySubtotal * commission;
      
      //Calculate total buy price
      buyTotal = buySubtotal + commissionBuy;
      
      //Calculate subtotal sold price
      soldSubtotal = stockSold * soldPrice;
      
      //Calculate sold commission
      commissionSold = soldSubtotal * commission;
      
      //Calculate total sold price
      soldTotal = soldSubtotal + commissionSold;
      
      //Calculate profit
      profit = soldTotal - buyTotal;
      
      //Display results
      JOptionPane.showMessageDialog(null, "Stock Purchase Price: $" + buySubtotal + 
                                    "\nStock Commission: $" + commissionBuy + 
                                    "\nStock Sold Price: $" + soldSubtotal + 
                                    "\nStock Commission: $" + commissionSold + 
                                    "\nNet Profit: $" + profit);
   }
}   