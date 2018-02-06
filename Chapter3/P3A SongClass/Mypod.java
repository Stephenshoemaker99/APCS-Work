public class Mypod
{
   public static void main( String[] arg)
   {
      String dayOfTheWeek = new String( "Monday" );
      
      // Creating your own object - Song
      Song firstSong = new Song( "Jack", "APCS", 1.29,  "Expiremental Soundscape",500);
      
      System.out.println(firstSong.getLengthInSecs()); 
      firstSong.setLengthInSecs( 1000 );
      System.out.println(firstSong.getLengthInSecs());
      System.out.println(dayOfTheWeek);
      System.out.println( firstSong);  
      System.out.println(firstSong.getMins());
      System.out.println(firstSong.getSecs());
   }
}