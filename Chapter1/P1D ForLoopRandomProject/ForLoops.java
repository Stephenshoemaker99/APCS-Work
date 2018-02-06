public class ForLoops
{
   public static void main( String[] args)
   {
      for (int index = 1; index < 10; index++)
      {
          int rand = (int) ((Math.random() * ((index*index) - index + 1)) + index);
          System.out.println( index + "\t" + index*index + "\t" + rand);
      }// end for loop
   }
}  