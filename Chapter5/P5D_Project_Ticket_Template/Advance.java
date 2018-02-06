public class Advance extends Ticket
   {
     private int numDays;
     public Advance(int days)
     {
         super();
         numDays = days;
     }
       
     public double getPrice()
     {
         if(numDays >= 10)    
         {
             return 30;
         }
         else
         {
             return 40;
         }
     }
       
   } // end class Advance