import java.util.ArrayList;
public class TicketDriver
   {
   public static void main( String[] args )
      {
      Ticket walkup1 = new Walkup();
      Ticket advance1 = new Advance( 14 );            // 14 days
      Ticket stuAdvance1 = new StudentAdvance(  12 ); // 12 days
      System.out.println(walkup1);
      System.out.println(advance1);
      System.out.println(stuAdvance1);
      
      ArrayList<Ticket> ticketHolder = new ArrayList<Ticket>();
      ticketHolder.add( walkup1 );
      ticketHolder.add( advance1 );
      ticketHolder.add( stuAdvance1 );
      
      for(int index = 0; index < ticketHolder.size(); index++)
         {
         System.out.println( ticketHolder.get(index) + "\n" );    
         } // end for each 
      } // end method main
   } // end class TicketDriver