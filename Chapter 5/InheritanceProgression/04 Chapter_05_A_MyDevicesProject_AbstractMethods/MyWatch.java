public class MyWatch extends MyDevice
   {
   
   public MyWatch()
      {
      super();   
      } // end zero argument constructor
      
   public MyWatch( int memory, String color )
      {
      super( memory, color );   // "pass the buck" to the superclass MyDevice   
      } // end two argument constructor
     
   public void connectToBluetooth()
      {
      System.out.println( "Connecting to bluetooth for a MyWatch..." );     
      } // end method connectToBlueTooth
      
   public String toString()
      {
      return super.toString();   // call the toString() method from MyDevice...
                                 // no need to rewrite it again!
      } // end method toString()
      
   } // end class MyWatch