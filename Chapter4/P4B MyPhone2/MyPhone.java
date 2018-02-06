import java.util.ArrayList;
import java.util.List;
public class MyPhone
{
   private String color;
   private double memory;
   private List<Song> songLibrary;
   public MyPhone()
      {
         color =  new String("Black");
         memory = 8.0;
         songLibrary = new ArrayList<Song>();
         songLibrary.add( new Song("Feel it Still", 300));
         songLibrary.add( new Song("Bohemian Rhapsody", 300));
         songLibrary.add( new Song("Rap God", 300));
         songLibrary.add( new Song("Anything by U2, sadly", 300));
      }
   public MyPhone( String initialColor, double initialMemory)
      {
         color =  initialColor;
         memory = initialMemory;
         songLibrary = new ArrayList<Song>();
         songLibrary.add( new Song("Feel it Still", 300));
         songLibrary.add( new Song("Bohemian Rhapsody", 300));
         songLibrary.add( new Song("Rap God", 300));
         songLibrary.add( new Song("Anything by U2, sadly", 300));
      }
   public int totalPlayTime()
      {
         int output = 0;
         for (int index = 0; index < songLibrary.size(); index++)
            {
               Song song = songLibrary.get(index);
               output += song.getLength();
            }
         return output;
      }
   public void deleteAllSongs()
      {
         for( int index = 0; index<songLibrary.size(); index++)
            {
               songLibrary.set( index, null);
            }
      }
   public String stringSongLibrary()
      {
         String output = "";
         for (int index = 0; index < songLibrary.size(); index++)
            {
               if(songLibrary.get(index) != null)
                  {
                  output += songLibrary.get(index).toString() + "\n";
                  }
            }
         return output;
      }
   public String toString()
      {
         String output = new String( "Color: " + color + "\n" +
                                     "Memory: " + memory + "GBs \n" +
                                     "Songs: \n" +
                                     stringSongLibrary());
         return output;
      }
}