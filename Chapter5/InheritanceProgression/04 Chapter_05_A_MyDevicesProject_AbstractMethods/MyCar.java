public class MyCar extends Vehicle
   {
   private int mpg;
   
   public MyCar( int initialMilesPerGallon )
      {
      mpg = initialMilesPerGallon;  
      } // end one-arg constructor

   public MyCar( int initialNumPassengers, int initialMilesPerGallon )
      {
      super( initialNumPassengers );
      mpg = initialMilesPerGallon;  
      } // end one-arg constructor

   public void connectToBluetooth()
      {
      System.out.println( "Connecting to bluetooth for a MyCar..." );        
      } // end method connectToBlueTooth
      
   public String toString()
      {
      return super.toString() + "\n" + 
             "Miles per gallon for this car is: " + mpg;
      } // end method toString
      
   } // end class MyCar