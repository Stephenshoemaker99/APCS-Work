import javax.swing.JOptionPane;
public class Password
{
   public static void main(String[] args)
   {
      boolean specialChar = false;
      String password = JOptionPane.showInputDialog("Please input a new Password that includes special Characters");
      while(!specialChar)
      {
         for (int index = 0; index < password.length(); index ++)
         {
            String letter = password.substring(index, index+1);
            if( letter.equals("+") ||
                letter.equals("-") ||
                letter.equals("*") ||
                letter.equals("/") ||
                letter.equals("@"))
                {
                 specialChar = true;
                }
         }
         if(!specialChar)
            {
            password = JOptionPane.showInputDialog("Please input a new Password that includes special Characters");
            }
      }
      System.out.println("The password is okay");
   }
}