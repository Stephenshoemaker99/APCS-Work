import javax.swing.JOptionPane;
public class Login
   {
   public static void main( String[] arg)
   { 
       String username = new String("banana");
       String password = new String("1234");
       String userentry = JOptionPane.showInputDialog("Please input your username: ");
       String passentry = JOptionPane.showInputDialog("Please input your password: ");
       if(userentry.equals(username))
           {
           if(passentry.equals(password))
           {
               System.out.println("Username and Password Correct");
           }
           else
           {
               System.out.println("Invalid Username or password");
           }
           }
       else 
         {
          System.out.println("Invalid Username or password");
         }//end if else chain
    }
}  