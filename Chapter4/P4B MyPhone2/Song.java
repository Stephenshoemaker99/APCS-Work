public class Song
{
   private String name;
   private int length;
   private int mins;
   private int secs; // seconds that are not encompassed by mins
   public Song()
      {
         name = null;
         length = 0;
         calcMins();
         calcSecs();
      }// zero-argument constructor
   public Song(String initialName, int initialLength)
      {
         name = initialName;
         length = initialLength;
         calcMins();
         calcSecs();
      }// two arg constructor
   public void calcMins()
      {
         mins = length / 60;
      }// calcs mins
   public void calcSecs()
      {
         calcMins();
         secs = length - (60 * mins);
      }// calcs secs
   public int getSecs()
      {
         calcSecs();
         return secs;
      }// gets secs
   public int getMins()
      {
         calcMins();
         return mins;
      }// get mins
   public int getLength()
      {
         return length;
      }//gets length
   public String getName()
      {
         return name;
      }//gets name
   public void setLength( int newLength)
      {
         length = newLength;
         calcMins();
         calcSecs();
      }// setLength
   public void setName( String newName)
      {
         name = newName;
      }// setName
   public String toString()
      {
         String output = new String("Name: " + name + "\n" +
                                    "Length:" + mins + ":" + secs);
         return output;
      }// the toString()
}