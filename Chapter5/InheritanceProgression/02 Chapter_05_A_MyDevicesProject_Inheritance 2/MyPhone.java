public class MyPhone extends MyDevice
   {
   private String carrier;    // cell phone service provider
   
   public MyPhone()
      {
      super();   // calls the constructor from the class
                 // above it, i.e., "MyDevice"
      carrier = new String( "No service" );
      } // end zero argument constructor
      
   public MyPhone( int initialMemory, String initialColor, String initialCarrier )
      {         
      super( initialMemory, initialColor );
      carrier = initialCarrier; // service provider
      } // end two argument constructor
      
   public String toString()
      {
      String output = new String( "" );
      output = super.toString() + "\n" +
               "Carrier is: " + carrier;
      return output;
      } // end method toString()
   } // end class MyPhone