public class MyWatch extends MyDevice
   {
   private double price;
   
   public MyWatch()
      {
      super(); 
      price = 0.0;
      } // end zero argument constructor
      
   public MyWatch( int initialMemory, String initialColor, double initialPrice )
      {
      super( initialMemory, initialColor );   // "pass the buck" to the superclass MyDevice   
      price = initialPrice;
      } // end two argument constructor
      
   public String toString()
      {      
      return "MyWatch info: " + super.toString() + "\nPrice is: " + price;                           
      } // end method toString()
      
   } // end class MyWatch