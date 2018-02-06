public class MyDevice
   {
   private int memory;
   private String color;
   
   public MyDevice()
      {
      memory = 8;      // in GB
      color = new String( "White" );
      }

   public MyDevice( int initialMemory, String initialColor )
      {
      memory = initialMemory;   // in GB
      color = initialColor;   
      } // end two argument constructor
      
   public String toString()
      {
      String output = new String();
      output = "\nMemory capacity is: " + memory + "GB\n" + 
               "Color is: " + color;
      return output;
      } // end method toString()

   } // end class MyDevice