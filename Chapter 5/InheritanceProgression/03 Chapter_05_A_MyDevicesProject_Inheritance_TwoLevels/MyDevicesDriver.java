import java.util.List;
import java.util.ArrayList;

public class MyDevicesDriver
   {
   public static void main( String[] args )
      {
      System.out.println( "Typical printout of individual objects..." );   
      MyPhone phone1 = new MyPhone();
      MyPhone phone2 = new MyPhone( 16, "Jet Black", "ATT" );
      System.out.println( phone1 + "\n" );
      System.out.println( phone2 + "\n"  );

      MyWatch watch1 = new MyWatch();
      MyWatch watch2 = new MyWatch( 64, "Blue", 99.99 );
      System.out.println( watch1 + "\n"  );
      System.out.println( watch2 + "\n"  );
      
      
      MyWatchController wc1 = new MyWatchController( 4, "White", 199.99, 10 );
      
      System.out.println( "Now with Inheritance" );
      System.out.println( "Polymorphically! traversing the ArrayList of MyDevices..." );
      List<MyDevice> inventory = new ArrayList<MyDevice>();
      inventory.add( phone1 );
      inventory.add( phone2 );
      inventory.add( watch1 );
      inventory.add( watch2 );
      inventory.add( wc1 );
      
      for( MyDevice device : inventory )
         {
         System.out.println( "\n\nDevice info:\n" + device + "\n" );  
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
   