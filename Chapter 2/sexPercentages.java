import javax.swing.JOptionPane;

public class sexPercentages
{
   public static void main(String[] args)
   {
      String maleInput;
      String femaleInput;
      double male;
      double female;
      double total;
      double percentMale;
      double percentFemale;
      
      //Get males
      maleInput = JOptionPane.showInputDialog("How many males are in the class?");
      
      //Get females
      femaleInput = JOptionPane.showInputDialog("How many females are in the class?");
      
      //Convert males & females
      male = Double.parseDouble(maleInput);
      female = Double.parseDouble(femaleInput);
      
      //Class total
      total = male + female;
      
      //Percent male
      percentMale = male / total;
      
      //Percent female
      percentFemale = female / total;
      
      //Display results
      JOptionPane.showMessageDialog(null, "Percentage of Males: " + percentMale + 
                                    "\nPercent of Females: " + percentFemale);
   }
}   