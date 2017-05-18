import javax.swing.JOptionPane;

public class calcWeight
{
   public static void main(String[] args)
   {
      String input;
      double mass;
      double weight;
      
      //Get mass
      input = JOptionPane.showInputDialog("Please enter the mass of an object:");
      
      //Convert to double
      mass = Double.parseDouble(input);
      
      //Calculate weight
      weight = mass * 9.8;
      
      //Boolean
      if (weight < 10)
      {
         JOptionPane.showMessageDialog(null, "Object is too light.");
      }
      else
      {
         if (weight < 1000)
         {
            JOptionPane.showMessageDialog(null, "Object is just right.");
         }
         else
         {
            JOptionPane.showMessageDialog(null, "Object is too heavy.");
         }
      }   
   }
}   