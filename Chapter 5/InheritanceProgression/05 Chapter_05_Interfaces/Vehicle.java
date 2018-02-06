public abstract class Vehicle 
   {
   private int numPassengers;
   
   public Vehicle()
      {
      numPassengers = 0;           
      } // end zero-arg constructor
   
   public Vehicle( int initialNumPassengers )
      {
      numPassengers = initialNumPassengers;   
      } // end one-argument constructor
         
   public String toString()
      {
      return "Number of passengers is: " + numPassengers;
      } // end method toString
   } // end class Vehicle