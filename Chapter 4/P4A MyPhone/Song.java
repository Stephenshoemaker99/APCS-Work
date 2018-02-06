public class Song
{
   private String name;
   private int length;
   
   public Song()
      {
         name = null;
         length = 0;
      }// zero-argument constructor
   public Song(String initialName, int initialLength)
      {
         name = initialName;
         length = initialLength;
      }
   public int calcMins()
      {
         return length / 60;
      }
   public int calcSecs()
      {
         return length - (60 * calcMins());
      }
   public int getLength()
      {
         return length;
      }
   public String getName()
      {
         return name;
      }
   public void setLength( int newLength)
      {
         length = newLength;
      }
   public void setName( String newName)
      {
         name = newName;
      }
   public String toString()
      {
         String output = new String("Name: " + name + "\n" +
                                    "Length:" + calcMins() + ":" + calcSecs());
         return output;
      }
}