public class MyWatch
   {
   private int memory;
   private String color;
   
   public MyWatch()
      {
      memory = 8;   // in GB
      color = new String( "Black" );   
      } // end zero-argument constructor
      
   public MyWatch( int initialMemory, String initialColor )
      {
      memory = initialMemory;   // in GB
      color = initialColor;   
      } // end two-argument constructor
      
   public String toString()
      {
      String output = new String();
      output = "Memory capacity is: " + memory + "GB\n" + 
               "Color is: " + color;
      return output;
      } // end method toString()
      
   } // end class MyWatch