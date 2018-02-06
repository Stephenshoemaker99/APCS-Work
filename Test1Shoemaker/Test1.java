import javax.swing.JOptionPane;
public class Test1
{
   public static void main( String[] arg)
   {
      int numDays = 32;
      while ( numDays >= 32 )
         {
         String input = JOptionPane.showInputDialog( "How many days do you wish to view (must be less than 32):" );
         numDays = Integer.parseInt ( input );
         }// While loop in order to make sure the number inputed is lower than 32
      
      int dates[] = new int[numDays];
      for( int index = 0; index < numDays; index++ )
         {
         dates[index] = index + 1;   
         }// adds the dates into the array must add one in order to start dates at 1
      
      int dailyTemps[] = new int[numDays];
      for ( int index = 0; index < numDays; index++ )
         {
         dailyTemps[index] = (int) ( ( Math.floor( Math.random() * 201) )-100);
         }// adds a random number in the range [-100 , 100]
      
      String forecast[] = new String[numDays];
      for( int index = 0; index < numDays; index++ )
         {
         if  (dailyTemps[index] >= 80)
            {
                 forecast[index] = new String( "Hot!" );
            }// testing if its hot
         else
            {  
            if ( dailyTemps[index] >= 50 )
               {
               forecast[index] = new String( "Moderate" );
               }//testing if its moderate
            else
               {
               if ( dailyTemps[index] >= 32 )
                  {
                  forecast[index] = new String( "Cold" );
                  } // testing if its cold
               else
                  {
                  forecast[index] = new String( "Freezing" );
                  }//must be freezing if it passes no other tests
               }//closes else loop from above because there were no other if statements to parse becaus eit must be "freezing"
            }//Giant if/else chain in order to parse the temperature and its corresponding rating 
         }// closes for loop naming the temperature and its rating
      
      System.out.println( "Daily temperatures for October 2020" );
      
      System.out.println( "Date \t Daily Temperatures (F) \t Forecast" );
      for (int index = 0; index < numDays; index++)
         {
         System.out.println( dates[index] + "\t" + dailyTemps[index] + "\t \t \t \t" + forecast[index] );
         }// prints out final output
   }// closes main
}// ends class
