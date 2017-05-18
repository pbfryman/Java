import javax.swing.JOptionPane;

public class wordGame
{
   public static void main(String[] args)
   {
      String name;
      String age;
      String city;
      String college;
      String profession;
      String animal;
      String pet;
      
      //Get user input
      name = JOptionPane.showInputDialog("What is your name?");
      age = JOptionPane.showInputDialog("How old are you?");
      city = JOptionPane.showInputDialog("What is your favorite city?");
      college = JOptionPane.showInputDialog("What is your favorite college?");
      profession = JOptionPane.showInputDialog("What is your dream profession?");
      animal = JOptionPane.showInputDialog("What is your favorite animal?");
      pet = JOptionPane.showInputDialog("What is your favorite name for a pet?");
      
      //Display results
      JOptionPane.showMessageDialog(null, "There once was a person named " + name + 
                                    " who lived in " + city + ". \nAt the age of " + age + 
                                    ", " + name + " went to college at the " + college + ". \n" + 
                                    name + " graduated and went to work as a " + profession + 
                                    ". " + "\nThen, " + name + " adopted a(n) " + animal + " named " + 
                                    pet + ". \nThey both lived happily ever after!");
   }
}   