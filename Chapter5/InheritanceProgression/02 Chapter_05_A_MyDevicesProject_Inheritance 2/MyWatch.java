public class MyWatch extends MyDevice
   {
   
   public MyWatch()
      {
      super();   
      } // end zero argument constructor
      
   public MyWatch( int initialMemory, String initialColor )
      {
      super( initialMemory, initialColor );   // "pass the buck" to the superclass MyDevice   
      } // end two-argument constructor
      
   public String toString()
      {
      return super.toString();   // call the toString() method from MyDevice...
                                 // no need to rewrite it again!
      } // end method toString()
      
   } // end class MyWatch