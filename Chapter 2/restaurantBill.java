import javax.swing.JOptionPane;

public class restaurantBill
{
   public static void main(String[] args)
   {
      String inputMeal;
      double meal;
      double tax = .0675;
      double mealTax;
      double mealAfterTax;
      double tip = .2;
      double mealTip;
      double mealTotal;
      
      //Get meal cost
      inputMeal = JOptionPane.showInputDialog("Please enter the cost of your meal:");
      
      //Convert meal to double
      meal = Double.parseDouble(inputMeal);
      
      //Calculate tax
      mealTax = meal * tax;
      
      //Calculate meal + tax
      mealAfterTax = meal + mealTax;
      
      //Calculate tip
      mealTip = mealAfterTax * tip;
      
      //Calculate total
      mealTotal = mealAfterTax + mealTip;
      
      //Display total
      JOptionPane.showMessageDialog(null, "Meal: $" + meal + "\nTax: $" + mealTax + 
                                    "\nTip: $" + mealTip + "\nTotal: $" + mealTotal);
   }
}   