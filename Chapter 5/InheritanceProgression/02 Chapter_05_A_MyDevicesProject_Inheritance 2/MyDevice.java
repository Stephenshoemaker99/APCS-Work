public class MyDevice
   {
   private int memory;
   private String color;
   
   public MyDevice()
      {
      memory = 8;
      color = new String( "Jet Black" );
      }

   public MyDevice( int initialMemory, String initialColor )
      {
      memory = initialMemory;   // in GB
      color = initialColor;   
      } // end two argument constructor
   
      
   public String toString()
      {
      String output = new String();
      output = "Memory capacity is: " + memory + "GB\n" + 
               "Color is: " + color;
      return output;
      } // end method toString()

   } // end class MyDevice