public class Song
   {
   /// The big 3 Essential elements of any class
   
   
   // 1. Instance Variables
   private String name;
   private String artist;
   private double cost;
   private String genre;
   private int lengthInSecs;
   // 2. Constructor- Initializing variables
   public Song()
      {
      artist = null;
      name = null;
      cost = 0.0;
      genre = null;
      lengthInSecs=0;
      }
   public Song( String initialArtist, String initialTitle,
               double initialCost,  String initialGenre,
               int initialLengthInSecs)
      {
      artist = initialArtist;
      name = initialTitle;
      cost = initialCost;
      genre= initialGenre;
      lengthInSecs= initialLengthInSecs;
      }
   
   public int getLengthInSecs()
      {
       return lengthInSecs; 
      }
   public void setLengthInSecs( int newSeconds)
      {
      lengthInSecs = newSeconds;
      }
   public String convertToMinSec()
      {
       int mins = (int) ((double)lengthInSecs)/ 60;
       int secs = (int) ((double) lengthInSecs) % 60;
       String output =  new String();
       output = "The length is: " + mins + " minutes and " + secs + " seconds.";
       return output;
      }
   public int getMins()
      {
      return (int) ((double)lengthInSecs)/ 60;
      }
   public int getSecs()
      {
      return (int) ((double) lengthInSecs) % 60;
      }
      
   // 3. toString() creating a "printout" of class variables
   public String toString()
      {
         
      String output =  new String();
      output ="Artist: " + artist + "\n" +
              "Name: " + name + "\n" + 
               convertToMinSec() + "\n" +
              "Cost: " + cost + "\n" +
              "Genre: " + genre;
      return output;
      }
   }// end class song         