
public class LogMessageDriver
{
public static void main( String[] args )
   {
   LogMessage message1 = new LogMessage( "Webserver:disk offline" );
   System.out.println( message1 );
   System.out.println( message1.getMachineID() );
   System.out.println( message1.getDescription() );
   System.out.println( message1.containsWord("disk"));
       
   } // end method main

    
} // end class LogMessageDriver