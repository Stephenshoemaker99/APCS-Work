public class MyPhone extends MyDevice
   {
   private String carrier;    // cell phone service provider
   
   public MyPhone()
      {
      super();   // calls the constructor from the class
                 // above it, i.e., "MyDevice"
      carrier = new String( "No service" );
      } // end zero argument constructor         

   public MyPhone( int initialMemory, String initialColor, String initialCarrier)
      {
      super( initialMemory, initialColor );   // calls the constructor from the class
                 // above it "MyDevice"
      carrier = new String( initialCarrier );
      } // end zero argument constructor

   public void connectToBluetooth()
      {
      System.out.println( "Connecting to bluetooth for a MyPhone..." );        
      } // end method connectToBlueTooth

   public String toString()
      {
      String output = new String( "" );
      output = super.toString() + "\n" +
               "Carrier is: " + carrier;
      return output;
      } // end method toString()
   } // end class MyPhone