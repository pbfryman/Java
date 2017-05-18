import javax.swing.JOptionPane;

public class bodyMass
{
   public static void main(String[] args)
   {
      String inputWeight;
      String inputHeight;
      double weight;
      double height;
      double bmi;
      
      //Get weight
      inputWeight = JOptionPane.showInputDialog("Please enter your weight: ");
      
      //Get height
      inputHeight = JOptionPane.showInputDialog("Please enter your height: ");
      
      //Convert to doubles
      weight = Double.parseDouble(inputWeight);
      height = Double.parseDouble(inputHeight);
      
      //Calculate BMI
      bmi = weight * 703 / Math.pow(height, 2.0);
      
      //Boolean
      if (bmi < 18.5)
      {
         JOptionPane.showMessageDialog(null, "You are underweight!");
      }
      else
      {
         if (bmi >= 18.5 && bmi <= 25)
         {
            JOptionPane.showMessageDialog(null, "You are perfect!");
         }   
         else
         {
            JOptionPane.showMessageDialog(null, "You are overweight!");
         }         
      }
       
   }
}   