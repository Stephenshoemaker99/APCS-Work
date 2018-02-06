import javax.swing.JOptionPane;
public class Login
{
   public static void main(String[] args)
   {
      String username = new String("banana");
      int password = 123;
      int ctr = 0;
      boolean notCorrect = true;
      while(ctr<3 && notCorrect)
         {
         String userentry = JOptionPane.showInputDialog("Please input your username: ");
         int passentry =  Integer.parseInt(JOptionPane.showInputDialog("Please input your password: "));// entry password
         
         if(userentry.equals(username) && (passentry == password))
           {
               System.out.println("Username and Password Correct");
               notCorrect = false;
           }// checks password
         else 
           {
            System.out.println("Invalid Username or password");
            }//end if else chain
         ctr++;
         }// checks the password three times
      if(notCorrect)
         {
            System.out.println("You have exceeded your three attempts.Please try again next period.");
         }
   }
}