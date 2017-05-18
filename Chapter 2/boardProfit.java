import javax.swing.JOptionPane;

public class boardProfit
{
   public static void main(String[] args)
   {
      String inputPrice;
      double price;
      double profit;
      
      //Get price
      inputPrice = JOptionPane.showInputDialog("What is the retail price?");
      
      //Convert price
      price = Double.parseDouble(inputPrice);
      
      //Calculate profit
      profit = price * .4;
      
      //Display profit
      JOptionPane.showMessageDialog(null, "Profit Earned: " + profit);
   }
}   