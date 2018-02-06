public class Song
   {
   /// The big 3 Essential elements of any class
   
   
   // 1. Instance Variables
   private int length;
   private String name;
   private String artist;
   private double cost;
   private String genre;
   // 2. Constructor- Initializing variables
   public Song()
      {
      artist = null;
      name = null;
      cost = 0.0;
      length = 0;
      genre = null;
      }
   public Song( String initialArtist, String initialTitle,
               double initialCost, int initialSongLength, String initialGenre)
      {
      artist = initialArtist;
      name = initialTitle;
      cost = initialCost;
      length = initialSongLength;
      genre= initialGenre;
      }
   // 3. toString() creating a "printout" of class variables
   public String toString()
      {
         
      String output =  new String();
      output ="Artist: " + artist + "\n" +
              "Name: " + name + "\n" + 
              "Length: " + length + "\n" +
              "Cost: " + cost + "\n" +
              "Genre: " + genre;
      return output;
      }
   }// end class song         