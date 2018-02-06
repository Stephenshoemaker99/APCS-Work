import java.util.List;
import java.util.ArrayList;

public class MyDevicesDriver
   {
   public static void main( String[] args )
      {
      MyPhone phone1 = new MyPhone();
      MyPhone phone2 = new MyPhone( 16, "Space Gray", "ATT" );
      
      System.out.println( "********Printing Phone info********" );
      ArrayList<MyPhone> phoneList = new ArrayList<MyPhone>();
      phoneList.add( phone1 );
      phoneList.add( phone2 );
      for( MyPhone cellphone : phoneList )
         {
         System.out.println( cellphone + "\n" );   
         } // end for
      
      
      MyWatch watch1 = new MyWatch();
      MyWatch watch2 = new MyWatch( 64, "Blue" );

      System.out.println( "\n\n********Printing Watch info********" );
      ArrayList<MyWatch> watchList = new ArrayList<MyWatch>();
      watchList.add( watch1 );
      watchList.add( watch2 );
      for( MyWatch wristWatch : watchList )
         {
         System.out.println( wristWatch + "\n" );   
         } // end for
      
      
      } // end method main
      
   } // end class MyDevicesDriver
   