public class MyWatchController extends MyWatch
   {
   private int numDevices;
   
   public MyWatchController()
      {
      super(); 
      numDevices = 0;
      } // end zero argument constructor
      
   public MyWatchController( int memory, String color )
      {
      super( memory, color );   // "pass the buck" to the superclass MyDevice   
      numDevices = 10;
      // end two argument constructor
      }
      
   public void connectToBluetooth()
      {
      //super.connectToBluetooth();    
      System.out.println( "Connecting to bluetooth for a MyWatchController..." );     
      } // end method connectToBlueTooth
      
   public String toString()
      {
      return super.toString();   // call the toString() method from MyDevice...
                                 // no need to rewrite it again!
      } // end method toString()
      
   } // end class MyWatch