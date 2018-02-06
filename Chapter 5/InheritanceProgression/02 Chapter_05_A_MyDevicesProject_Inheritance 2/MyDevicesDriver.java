import java.util.List;
import java.util.ArrayList;

public class MyDevicesDriver
   {
   public static void main( String[] args )
      {
      MyDevice someDevice = new MyDevice();
      MyPhone phone1 = new MyPhone();
      MyPhone phone2 = new MyPhone();
      MyWatch watch1 = new MyWatch();
      MyWatch watch2 = new MyWatch();
      
      System.out.println( "Now with Inheritance" );
      System.out.println( "Polymorphically! traversing the ArrayList of MyDevices..." );
      List<MyDevice> inventory = new ArrayList<MyDevice>();
      inventory.add( phone1 );
      inventory.add( phone2 );
      inventory.add( watch1 );
      inventory.add( watch2 );
      
      for( MyDevice device : inventory )
         {
         System.out.println( "\n\nDevice info:\n" + device );  
         } // end for each
         
      System.out.println( "\n\n\nSteps to implementing Inheritance..." );
      System.out.println( "Step 1 - Factor out common instance variables and methods into a superclass" );
      System.out.println( "Step 2 - use keyword \"extend\" to link it to the superclass" );
      System.out.println( "Step 3 - use super() to call the superclass's constructor (zero or multi)" );
      System.out.println( "Step 4 - use super.methodCall() to call methods in the superclass" );
      System.out.println( "Step 5 - create arrays or ArrayLists of superclass object to " + 
                           " polymorphically process all \"seemingly different\" objects" );
      
      } // end method main
      
   } // end class MyDevicesDriver
   