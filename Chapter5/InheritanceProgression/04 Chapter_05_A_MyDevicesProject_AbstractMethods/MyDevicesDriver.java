import java.util.List;
import java.util.ArrayList;

public class MyDevicesDriver
   {
   public static void main( String[] args )
      {
      MyWatch watch = new MyWatch( 32, "Jet Black" );
      MyPhone phone = new MyPhone( 16, "Blue", "AT&T" );
      MyCar car = new MyCar( 40 ); 
      
      List<MyDevice> inventory = new ArrayList<MyDevice>();
      inventory.add( watch );
      inventory.add( phone );
      //inventory.add( car );
      
      for( MyDevice device : inventory )
         {
         device.connectToBluetooth();              
         } // end for each
         
      //car.connectToBluetooth();
      } // end method main
      
   } // end class MyDevicesDriver
   