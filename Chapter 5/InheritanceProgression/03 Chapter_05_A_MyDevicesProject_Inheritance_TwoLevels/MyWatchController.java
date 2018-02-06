public class MyWatchController extends MyWatch
   {
   private int numDevicesToControl;
   
   public MyWatchController()
      {
      super();
      numDevicesToControl = 0;
      } // end constructor 
       
   public MyWatchController( int initialMemory, String initialColor , double initialPrice, int initialNumDevices )   
      {
      super( initialMemory, initialColor, initialPrice);   // let the superclass handle initializing these instance variables
      numDevicesToControl = initialNumDevices;
      } // end constructor 

   public String toString()
      {      
      return "MyWatchController info: " + super.toString() + "\nNumber of devices is: " + numDevicesToControl;
           // call the toString() method from MyDevice...
           // no need to rewrite it again!
                                
      } // end method toString()

   } // end class MyWatchController