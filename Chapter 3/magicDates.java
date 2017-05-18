import javax.swing.JOptionPane;

public class magicDates
{
   public static void main(String[] args)
   {
      String inputMonth;
      String inputDay;
      String inputYear;
      int month;
      int day;
      int year;
      int total;
      
      //Get month
      inputMonth = JOptionPane.showInputDialog("Please enter the month in numeric form (ex. 12):");
      
      //Get day
      inputDay = JOptionPane.showInputDialog("Please enter the day in numeric form (ex. 31):");
      
      //Get year
      inputYear = JOptionPane.showInputDialog("Please enter the year in two-digit form (ex. 12):");
      
      //Convert to doubles
      month = Integer.parseInt(inputMonth);
      day = Integer.parseInt(inputDay);
      year = Integer.parseInt(inputYear);
      
      //Calculate total
      total = month * day;
      
      //Boolean
      if (total == year)
      {
         JOptionPane.showMessageDialog(null, "The date is magic!");
      }
      else
      {
         JOptionPane.showMessageDialog(null, "The date is not magic!");
      }
   }
}   