public class MyPhone extends Device
   {
   private String carrier;    // cell phone service provider
   
   public MyPhone()
      {
      super(); 
      carrier = new String( "none" );
      } // end zero argument constructor
      
   public MyPhone( int initialMemory, String initialColor, String initialCarrier )
      {         
      super(initialColor, initialMemory); 
      carrier = initialCarrier;
      } // end three argument constructor
      
   public String toString()
      {
      String output = new String();
      output = "Memory capacity is: " + super.getMemory() + "GB\n" + 
               "Color is: " + super.getColor() + "\n" +
               "Carrier is: " + carrier;
      return output;
      } // end method toString()
   } // end class MyPhone