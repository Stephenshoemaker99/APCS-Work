import java.util.ArrayList;
import java.util.List;
public class MyPhone
{
   private String color;
   private double memory;
   private Song[] songLibrary;
   public MyPhone()
      {
         color =  new String("Black");
         memory = 8.0;
         songLibrary = new Song[4];
         songLibrary[0] = new Song("Feel it Still", 300);
         songLibrary[1] = new Song("Bohemian Rhapsody", 300);
         songLibrary[2] = new Song("Rap God", 300);
         songLibrary[3] = new Song("Anything by U2, sadly", 300);
      }
   public MyPhone( String initialColor, double initialMemory)
      {
         color =  initialColor;
         memory = initialMemory;
         songLibrary = new Song[4];
         songLibrary[0] = new Song("Feel it Still", 300);
         songLibrary[1] = new Song("Bohemian Rhapsody", 300);
         songLibrary[2] = new Song("Rap God", 300);
         songLibrary[3] = new Song("Anything by U2, sadly", 300);
      }
   public int totalPlayTime()
      {
         int output = 0;
         for (int index = 0; index < songLibrary.length; index++)
            {
               Song song = songLibrary[index];
               output += song.getLength();
            }
         return output;
      }
   public void deleteAllSongs()
      {
         for( int index = 0; index<songLibrary.length; index++)
            {
               songLibrary[index] =null;
            }
      }
   public String stringSongLibrary()
      {
         String output = "";
         for (int index = 0; index < songLibrary.length; index++)
            {
            if(songLibrary[index] != null)
                  {
                  output += songLibrary[index].toString() + "\n";
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