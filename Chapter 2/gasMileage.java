import javax.swing.JOptionPane;

public class gasMileage
{
   public static void main(String[] args)
   {
      String milesInput;
      String gasInput;
      double miles;
      double gas;
      double mileage;
      
      //Get miles
      milesInput = JOptionPane.showInputDialog("How many miles did you drive?");
      
      //Get gas
      gasInput = JOptionPane.showInputDialog("How many gallons of gas did you use?");
      
      //Convert miles
      miles = Double.parseDouble(milesInput);
      
      //Convert gas
      gas = Double.parseDouble(gasInput);
      
      //Calculate mileage
      mileage = miles / gas;
      
      //Display mileage
      JOptionPane.showMessageDialog(null, "Your current gas mileage is: " + mileage);
   }
}   