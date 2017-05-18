import javax.swing.JOptionPane;

public class softwareSales
{
   public static void main(String[] args)
   {
      int order; //number of packages per order
      double packagePrice = 99.0; //price per package = $99
      double discount; //amount of discount
      double regularPrice; //price before discount
      double totalPrice; //total price of order with discount
      
      //Get number of packages in the order
      order = JOptionPane.showInputDialog("Please enter the number of packages purchased:");
      
      //Convert order to double
      packages = Double.parseDouble(order);
      
      //Calculate regular price
      regularPrice = packages * packagePrice;
      
      //Determine discount
      if (order >= 10 && order <= 19)
      {
         discount = regularPrice * .2);
         totalPrice = regularPrice - discount;
      }
      else (order >= 20 && order <= 49)
      {
         discount = regularPrice * .3;
         totalPrice = regularPrice - discount;
      }
      if (order >= 50 && order <= 99)
      {
         discount = regularPrice * .4;
         totalPrice = regularPrice - discount;
      }
      else (order >= 100)
      {
         discount = regularPrice * .5;
         totalPrice = regularPrice - discount;
      }
      
      //Display output
      JOptionPane.showMessageDialog(null, "Regular Price: " + regularPrice + "/nDiscount: " + discount +
                                       "/nTotal: " = totalPrice;
   }
}