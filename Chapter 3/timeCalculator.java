import javax.swing.JOptionPane;

public class timeCalculator
{
   public static void main(String[] args)
   {
      String input;
      int time;
      int days = 0;
      int hours = 0;
      int minutes = 0;
      int seconds = 0;
      
      //Get user input
      input = JOptionPane.showInputDialog("Please enter a number of seconds:");
      
      //Convert to double
      time = Integer.parseInt(input);
      
      //Calculate
      if (time >= 86400)
      {
         days = time / 86400;
         hours = (time % 86400 ) / 3600 ;
         minutes = ((time % 86400 ) % 3600 ) / 60;
         seconds = ((time % 86400 ) % 3600 ) % 60;
      }
      else
      {
         if (time >= 3600)
         {
            hours = (time % 86400 ) / 3600 ;
            minutes = ((time % 86400 ) % 3600 ) / 60;
            seconds = ((time % 86400 ) % 3600 ) % 60;
         }
         else
         {
            if (time >= 60)
            {
               minutes = ((time % 86400 ) % 3600 ) / 60;
               seconds = ((time % 86400 ) % 3600 ) % 60;
            }
         }
      }
      
      //Display results
      JOptionPane.showMessageDialog(null, "Days: " + days + 
                                    " \nHours: " + hours + " \nMinutes: " + minutes + 
                                    " \nSeconds: " + seconds);
   }
}   